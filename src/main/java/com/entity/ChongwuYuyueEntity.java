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
 * 宠物预约
 *
 * @author 
 * @email
 */
@TableName("chongwu_yuyue")
public class ChongwuYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuYuyueEntity() {

	}

	public ChongwuYuyueEntity(T t) {
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
     * 报名编号
     */
    @ColumnInfo(comment="报名编号",type="varchar(200)")
    @TableField(value = "chongwu_yuyue_uuid_number")

    private String chongwuYuyueUuidNumber;


    /**
     * 宠物
     */
    @ColumnInfo(comment="宠物",type="int(11)")
    @TableField(value = "chongwu_id")

    private Integer chongwuId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报名理由
     */
    @ColumnInfo(comment="报名理由",type="longtext")
    @TableField(value = "chongwu_yuyue_text")

    private String chongwuYuyueText;


    /**
     * 报名状态
     */
    @ColumnInfo(comment="报名状态",type="int(11)")
    @TableField(value = "chongwu_yuyue_yesno_types")

    private Integer chongwuYuyueYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="longtext")
    @TableField(value = "chongwu_yuyue_yesno_text")

    private String chongwuYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "chongwu_yuyue_shenhe_time")

    private Date chongwuYuyueShenheTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="预约时间",type="timestamp")
    @TableField(value = "chongwu_yuyue_time")

    private Date chongwuYuyueTime;


    /**
     * 宠物报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="宠物报名时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ChongwuYuyue{" +
            ", id=" + id +
            ", chongwuYuyueUuidNumber=" + chongwuYuyueUuidNumber +
            ", chongwuId=" + chongwuId +
            ", yonghuId=" + yonghuId +
            ", chongwuYuyueText=" + chongwuYuyueText +
            ", chongwuYuyueYesnoTypes=" + chongwuYuyueYesnoTypes +
            ", chongwuYuyueYesnoText=" + chongwuYuyueYesnoText +
            ", chongwuYuyueShenheTime=" + DateUtil.convertString(chongwuYuyueShenheTime,"yyyy-MM-dd") +
            ", chongwuYuyueTime=" + DateUtil.convertString(chongwuYuyueTime,"yyyy-MM-dd") +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
