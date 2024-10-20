
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 爱宠天地
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/aichong")
public class AichongController {
    private static final Logger logger = LoggerFactory.getLogger(AichongController.class);

    private static final String TABLE_NAME = "aichong";

    @Autowired
    private AichongService aichongService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChongwuService chongwuService;//宠物
    @Autowired
    private ChongwuCollectionService chongwuCollectionService;//宠物收藏
    @Autowired
    private ChongwuLiuyanService chongwuLiuyanService;//宠物留言
    @Autowired
    private ChongwuYuyueService chongwuYuyueService;//宠物预约
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private NewsService newsService;//宠物资讯
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("aichongDeleteStart",1);params.put("aichongDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = aichongService.queryPage(params);

        //字典表数据转换
        List<AichongView> list =(List<AichongView>)page.getList();
        for(AichongView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        AichongEntity aichong = aichongService.selectById(id);
        if(aichong !=null){
            //entity转view
            AichongView view = new AichongView();
            BeanUtils.copyProperties( aichong , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody AichongEntity aichong, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,aichong:{}",this.getClass().getName(),aichong.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<AichongEntity> queryWrapper = new EntityWrapper<AichongEntity>()
            .eq("aichong_name", aichong.getAichongName())
            .eq("aichong_types", aichong.getAichongTypes())
            .eq("aichong_video", aichong.getAichongVideo())
            .eq("aichong_delete", 1)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        AichongEntity aichongEntity = aichongService.selectOne(queryWrapper);
        if(aichongEntity==null){
            aichong.setAichongDelete(1);
            aichong.setInsertTime(new Date());
            aichong.setCreateTime(new Date());
            aichongService.insert(aichong);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody AichongEntity aichong, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,aichong:{}",this.getClass().getName(),aichong.toString());
        AichongEntity oldAichongEntity = aichongService.selectById(aichong.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(aichong.getAichongPhoto()) || "null".equals(aichong.getAichongPhoto())){
                aichong.setAichongPhoto(null);
        }
        if("".equals(aichong.getAichongVideo()) || "null".equals(aichong.getAichongVideo())){
                aichong.setAichongVideo(null);
        }

            aichongService.updateById(aichong);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<AichongEntity> oldAichongList =aichongService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<AichongEntity> list = new ArrayList<>();
        for(Integer id:ids){
            AichongEntity aichongEntity = new AichongEntity();
            aichongEntity.setId(id);
            aichongEntity.setAichongDelete(2);
            list.add(aichongEntity);
        }
        if(list != null && list.size() >0){
            aichongService.updateBatchById(list);
        }

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<AichongEntity> aichongList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            AichongEntity aichongEntity = new AichongEntity();
//                            aichongEntity.setAichongName(data.get(0));                    //爱宠名称 要改的
//                            aichongEntity.setAichongUuidNumber(data.get(0));                    //爱宠编号 要改的
//                            aichongEntity.setAichongPhoto("");//详情和图片
//                            aichongEntity.setAichongTypes(Integer.valueOf(data.get(0)));   //爱宠类型 要改的
//                            aichongEntity.setAichongVideo(data.get(0));                    //爱宠视频 要改的
//                            aichongEntity.setAichongContent("");//详情和图片
//                            aichongEntity.setAichongDelete(1);//逻辑删除字段
//                            aichongEntity.setInsertTime(date);//时间
//                            aichongEntity.setCreateTime(date);//时间
                            aichongList.add(aichongEntity);


                            //把要查询是否重复的字段放入map中
                                //爱宠编号
                                if(seachFields.containsKey("aichongUuidNumber")){
                                    List<String> aichongUuidNumber = seachFields.get("aichongUuidNumber");
                                    aichongUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> aichongUuidNumber = new ArrayList<>();
                                    aichongUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("aichongUuidNumber",aichongUuidNumber);
                                }
                        }

                        //查询是否重复
                         //爱宠编号
                        List<AichongEntity> aichongEntities_aichongUuidNumber = aichongService.selectList(new EntityWrapper<AichongEntity>().in("aichong_uuid_number", seachFields.get("aichongUuidNumber")).eq("aichong_delete", 1));
                        if(aichongEntities_aichongUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(AichongEntity s:aichongEntities_aichongUuidNumber){
                                repeatFields.add(s.getAichongUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [爱宠编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        aichongService.insertBatch(aichongList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = aichongService.queryPage(params);

        //字典表数据转换
        List<AichongView> list =(List<AichongView>)page.getList();
        for(AichongView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        AichongEntity aichong = aichongService.selectById(id);
            if(aichong !=null){


                //entity转view
                AichongView view = new AichongView();
                BeanUtils.copyProperties( aichong , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody AichongEntity aichong, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,aichong:{}",this.getClass().getName(),aichong.toString());
        Wrapper<AichongEntity> queryWrapper = new EntityWrapper<AichongEntity>()
            .eq("aichong_name", aichong.getAichongName())
            .eq("aichong_uuid_number", aichong.getAichongUuidNumber())
            .eq("aichong_types", aichong.getAichongTypes())
            .eq("aichong_video", aichong.getAichongVideo())
            .eq("aichong_delete", aichong.getAichongDelete())
//            .notIn("aichong_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        AichongEntity aichongEntity = aichongService.selectOne(queryWrapper);
        if(aichongEntity==null){
            aichong.setAichongDelete(1);
            aichong.setInsertTime(new Date());
            aichong.setCreateTime(new Date());
        aichongService.insert(aichong);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

