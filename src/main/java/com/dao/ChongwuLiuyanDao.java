package com.dao;

import com.entity.ChongwuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuLiuyanView;

/**
 * 宠物留言 Dao 接口
 *
 * @author 
 */
public interface ChongwuLiuyanDao extends BaseMapper<ChongwuLiuyanEntity> {

   List<ChongwuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
