package com.dao;

import com.entity.ChongwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuView;

/**
 * 宠物 Dao 接口
 *
 * @author 
 */
public interface ChongwuDao extends BaseMapper<ChongwuEntity> {

   List<ChongwuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
