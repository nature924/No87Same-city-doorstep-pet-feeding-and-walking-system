package com.entity.model;

import com.entity.ChongwuYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwuYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 报名编号
     */
    private String chongwuYuyueUuidNumber;


    /**
     * 宠物
     */
    private Integer chongwuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 报名理由
     */
    private String chongwuYuyueText;


    /**
     * 报名状态
     */
    private Integer chongwuYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String chongwuYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chongwuYuyueShenheTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chongwuYuyueTime;


    /**
     * 宠物报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：报名编号
	 */
    public String getChongwuYuyueUuidNumber() {
        return chongwuYuyueUuidNumber;
    }


    /**
	 * 设置：报名编号
	 */
    public void setChongwuYuyueUuidNumber(String chongwuYuyueUuidNumber) {
        this.chongwuYuyueUuidNumber = chongwuYuyueUuidNumber;
    }
    /**
	 * 获取：宠物
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }


    /**
	 * 设置：宠物
	 */
    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报名理由
	 */
    public String getChongwuYuyueText() {
        return chongwuYuyueText;
    }


    /**
	 * 设置：报名理由
	 */
    public void setChongwuYuyueText(String chongwuYuyueText) {
        this.chongwuYuyueText = chongwuYuyueText;
    }
    /**
	 * 获取：报名状态
	 */
    public Integer getChongwuYuyueYesnoTypes() {
        return chongwuYuyueYesnoTypes;
    }


    /**
	 * 设置：报名状态
	 */
    public void setChongwuYuyueYesnoTypes(Integer chongwuYuyueYesnoTypes) {
        this.chongwuYuyueYesnoTypes = chongwuYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getChongwuYuyueYesnoText() {
        return chongwuYuyueYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setChongwuYuyueYesnoText(String chongwuYuyueYesnoText) {
        this.chongwuYuyueYesnoText = chongwuYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getChongwuYuyueShenheTime() {
        return chongwuYuyueShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setChongwuYuyueShenheTime(Date chongwuYuyueShenheTime) {
        this.chongwuYuyueShenheTime = chongwuYuyueShenheTime;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getChongwuYuyueTime() {
        return chongwuYuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setChongwuYuyueTime(Date chongwuYuyueTime) {
        this.chongwuYuyueTime = chongwuYuyueTime;
    }
    /**
	 * 获取：宠物报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：宠物报名时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
