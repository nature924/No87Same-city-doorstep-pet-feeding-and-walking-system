package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 爱宠天地
 *
 * @author 
 * @email
 */
@TableName("aichong")
public class AichongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public AichongEntity() {

	}

	public AichongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 爱宠名称
     */
    @ColumnInfo(comment="爱宠名称",type="varchar(200)")
    @TableField(value = "aichong_name")

    private String aichongName;


    /**
     * 爱宠编号
     */
    @ColumnInfo(comment="爱宠编号",type="varchar(200)")
    @TableField(value = "aichong_uuid_number")

    private String aichongUuidNumber;


    /**
     * 爱宠照片
     */
    @ColumnInfo(comment="爱宠照片",type="varchar(200)")
    @TableField(value = "aichong_photo")

    private String aichongPhoto;


    /**
     * 爱宠类型
     */
    @ColumnInfo(comment="爱宠类型",type="int(11)")
    @TableField(value = "aichong_types")

    private Integer aichongTypes;


    /**
     * 爱宠视频
     */
    @ColumnInfo(comment="爱宠视频",type="varchar(200)")
    @TableField(value = "aichong_video")

    private String aichongVideo;


    /**
     * 爱宠介绍
     */
    @ColumnInfo(comment="爱宠介绍",type="longtext")
    @TableField(value = "aichong_content")

    private String aichongContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "aichong_delete")

    private Integer aichongDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：爱宠名称
	 */
    public String getAichongName() {
        return aichongName;
    }
    /**
	 * 设置：爱宠名称
	 */

    public void setAichongName(String aichongName) {
        this.aichongName = aichongName;
    }
    /**
	 * 获取：爱宠编号
	 */
    public String getAichongUuidNumber() {
        return aichongUuidNumber;
    }
    /**
	 * 设置：爱宠编号
	 */

    public void setAichongUuidNumber(String aichongUuidNumber) {
        this.aichongUuidNumber = aichongUuidNumber;
    }
    /**
	 * 获取：爱宠照片
	 */
    public String getAichongPhoto() {
        return aichongPhoto;
    }
    /**
	 * 设置：爱宠照片
	 */

    public void setAichongPhoto(String aichongPhoto) {
        this.aichongPhoto = aichongPhoto;
    }
    /**
	 * 获取：爱宠类型
	 */
    public Integer getAichongTypes() {
        return aichongTypes;
    }
    /**
	 * 设置：爱宠类型
	 */

    public void setAichongTypes(Integer aichongTypes) {
        this.aichongTypes = aichongTypes;
    }
    /**
	 * 获取：爱宠视频
	 */
    public String getAichongVideo() {
        return aichongVideo;
    }
    /**
	 * 设置：爱宠视频
	 */

    public void setAichongVideo(String aichongVideo) {
        this.aichongVideo = aichongVideo;
    }
    /**
	 * 获取：爱宠介绍
	 */
    public String getAichongContent() {
        return aichongContent;
    }
    /**
	 * 设置：爱宠介绍
	 */

    public void setAichongContent(String aichongContent) {
        this.aichongContent = aichongContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getAichongDelete() {
        return aichongDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setAichongDelete(Integer aichongDelete) {
        this.aichongDelete = aichongDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Aichong{" +
            ", id=" + id +
            ", aichongName=" + aichongName +
            ", aichongUuidNumber=" + aichongUuidNumber +
            ", aichongPhoto=" + aichongPhoto +
            ", aichongTypes=" + aichongTypes +
            ", aichongVideo=" + aichongVideo +
            ", aichongContent=" + aichongContent +
            ", aichongDelete=" + aichongDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
