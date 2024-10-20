package com.entity.vo;

import com.entity.AichongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 爱宠天地
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("aichong")
public class AichongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 爱宠名称
     */

    @TableField(value = "aichong_name")
    private String aichongName;


    /**
     * 爱宠编号
     */

    @TableField(value = "aichong_uuid_number")
    private String aichongUuidNumber;


    /**
     * 爱宠照片
     */

    @TableField(value = "aichong_photo")
    private String aichongPhoto;


    /**
     * 爱宠类型
     */

    @TableField(value = "aichong_types")
    private Integer aichongTypes;


    /**
     * 爱宠视频
     */

    @TableField(value = "aichong_video")
    private String aichongVideo;


    /**
     * 爱宠介绍
     */

    @TableField(value = "aichong_content")
    private String aichongContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "aichong_delete")
    private Integer aichongDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：爱宠名称
	 */
    public String getAichongName() {
        return aichongName;
    }


    /**
	 * 获取：爱宠名称
	 */

    public void setAichongName(String aichongName) {
        this.aichongName = aichongName;
    }
    /**
	 * 设置：爱宠编号
	 */
    public String getAichongUuidNumber() {
        return aichongUuidNumber;
    }


    /**
	 * 获取：爱宠编号
	 */

    public void setAichongUuidNumber(String aichongUuidNumber) {
        this.aichongUuidNumber = aichongUuidNumber;
    }
    /**
	 * 设置：爱宠照片
	 */
    public String getAichongPhoto() {
        return aichongPhoto;
    }


    /**
	 * 获取：爱宠照片
	 */

    public void setAichongPhoto(String aichongPhoto) {
        this.aichongPhoto = aichongPhoto;
    }
    /**
	 * 设置：爱宠类型
	 */
    public Integer getAichongTypes() {
        return aichongTypes;
    }


    /**
	 * 获取：爱宠类型
	 */

    public void setAichongTypes(Integer aichongTypes) {
        this.aichongTypes = aichongTypes;
    }
    /**
	 * 设置：爱宠视频
	 */
    public String getAichongVideo() {
        return aichongVideo;
    }


    /**
	 * 获取：爱宠视频
	 */

    public void setAichongVideo(String aichongVideo) {
        this.aichongVideo = aichongVideo;
    }
    /**
	 * 设置：爱宠介绍
	 */
    public String getAichongContent() {
        return aichongContent;
    }


    /**
	 * 获取：爱宠介绍
	 */

    public void setAichongContent(String aichongContent) {
        this.aichongContent = aichongContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getAichongDelete() {
        return aichongDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setAichongDelete(Integer aichongDelete) {
        this.aichongDelete = aichongDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
