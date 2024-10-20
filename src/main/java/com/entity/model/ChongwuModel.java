package com.entity.model;

import com.entity.ChongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宠物名称
     */
    private String chongwuName;


    /**
     * 宠物编号
     */
    private String chongwuUuidNumber;


    /**
     * 宠物照片
     */
    private String chongwuPhoto;


    /**
     * 宠物地点
     */
    private String chongwuAddress;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 宠物类型
     */
    private Integer chongwuTypes;


    /**
     * 宠物介绍
     */
    private String chongwuContent;


    /**
     * 逻辑删除
     */
    private Integer chongwuDelete;


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
	 * 获取：宠物名称
	 */
    public String getChongwuName() {
        return chongwuName;
    }


    /**
	 * 设置：宠物名称
	 */
    public void setChongwuName(String chongwuName) {
        this.chongwuName = chongwuName;
    }
    /**
	 * 获取：宠物编号
	 */
    public String getChongwuUuidNumber() {
        return chongwuUuidNumber;
    }


    /**
	 * 设置：宠物编号
	 */
    public void setChongwuUuidNumber(String chongwuUuidNumber) {
        this.chongwuUuidNumber = chongwuUuidNumber;
    }
    /**
	 * 获取：宠物照片
	 */
    public String getChongwuPhoto() {
        return chongwuPhoto;
    }


    /**
	 * 设置：宠物照片
	 */
    public void setChongwuPhoto(String chongwuPhoto) {
        this.chongwuPhoto = chongwuPhoto;
    }
    /**
	 * 获取：宠物地点
	 */
    public String getChongwuAddress() {
        return chongwuAddress;
    }


    /**
	 * 设置：宠物地点
	 */
    public void setChongwuAddress(String chongwuAddress) {
        this.chongwuAddress = chongwuAddress;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：宠物类型
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 设置：宠物类型
	 */
    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 获取：宠物介绍
	 */
    public String getChongwuContent() {
        return chongwuContent;
    }


    /**
	 * 设置：宠物介绍
	 */
    public void setChongwuContent(String chongwuContent) {
        this.chongwuContent = chongwuContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getChongwuDelete() {
        return chongwuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setChongwuDelete(Integer chongwuDelete) {
        this.chongwuDelete = chongwuDelete;
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
