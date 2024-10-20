package com.dao;

import com.entity.AichongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.AichongView;

/**
 * 爱宠天地 Dao 接口
 *
 * @author 
 */
public interface AichongDao extends BaseMapper<AichongEntity> {

   List<AichongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
