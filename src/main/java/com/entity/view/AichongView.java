package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.AichongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 爱宠天地
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("aichong")
public class AichongView extends AichongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 爱宠类型的值
	*/
	@ColumnInfo(comment="爱宠类型的字典表值",type="varchar(200)")
	private String aichongValue;




	public AichongView() {

	}

	public AichongView(AichongEntity aichongEntity) {
		try {
			BeanUtils.copyProperties(this, aichongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 爱宠类型的值
	*/
	public String getAichongValue() {
		return aichongValue;
	}
	/**
	* 设置： 爱宠类型的值
	*/
	public void setAichongValue(String aichongValue) {
		this.aichongValue = aichongValue;
	}




	@Override
	public String toString() {
		return "AichongView{" +
			", aichongValue=" + aichongValue +
			"} " + super.toString();
	}
}
