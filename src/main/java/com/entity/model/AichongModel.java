package com.entity.model;

import com.entity.AichongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 爱宠天地
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class AichongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 爱宠名称
     */
    private String aichongName;


    /**
     * 爱宠编号
     */
    private String aichongUuidNumber;


    /**
     * 爱宠照片
     */
    private String aichongPhoto;


    /**
     * 爱宠类型
     */
    private Integer aichongTypes;


    /**
     * 爱宠视频
     */
    private String aichongVideo;


    /**
     * 爱宠介绍
     */
    private String aichongContent;


    /**
     * 逻辑删除
     */
    private Integer aichongDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
