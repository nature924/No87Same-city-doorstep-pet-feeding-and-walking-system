package com.entity.vo;

import com.entity.ChongwuYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwu_yuyue")
public class ChongwuYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 报名编号
     */

    @TableField(value = "chongwu_yuyue_uuid_number")
    private String chongwuYuyueUuidNumber;


    /**
     * 宠物
     */

    @TableField(value = "chongwu_id")
    private Integer chongwuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 报名理由
     */

    @TableField(value = "chongwu_yuyue_text")
    private String chongwuYuyueText;


    /**
     * 报名状态
     */

    @TableField(value = "chongwu_yuyue_yesno_types")
    private Integer chongwuYuyueYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "chongwu_yuyue_yesno_text")
    private String chongwuYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "chongwu_yuyue_shenhe_time")
    private Date chongwuYuyueShenheTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "chongwu_yuyue_time")
    private Date chongwuYuyueTime;


    /**
     * 宠物报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：报名编号
	 */
    public String getChongwuYuyueUuidNumber() {
        return chongwuYuyueUuidNumber;
    }


    /**
	 * 获取：报名编号
	 */

    public void setChongwuYuyueUuidNumber(String chongwuYuyueUuidNumber) {
        this.chongwuYuyueUuidNumber = chongwuYuyueUuidNumber;
    }
    /**
	 * 设置：宠物
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }


    /**
	 * 获取：宠物
	 */

    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：报名理由
	 */
    public String getChongwuYuyueText() {
        return chongwuYuyueText;
    }


    /**
	 * 获取：报名理由
	 */

    public void setChongwuYuyueText(String chongwuYuyueText) {
        this.chongwuYuyueText = chongwuYuyueText;
    }
    /**
	 * 设置：报名状态
	 */
    public Integer getChongwuYuyueYesnoTypes() {
        return chongwuYuyueYesnoTypes;
    }


    /**
	 * 获取：报名状态
	 */

    public void setChongwuYuyueYesnoTypes(Integer chongwuYuyueYesnoTypes) {
        this.chongwuYuyueYesnoTypes = chongwuYuyueYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getChongwuYuyueYesnoText() {
        return chongwuYuyueYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setChongwuYuyueYesnoText(String chongwuYuyueYesnoText) {
        this.chongwuYuyueYesnoText = chongwuYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getChongwuYuyueShenheTime() {
        return chongwuYuyueShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setChongwuYuyueShenheTime(Date chongwuYuyueShenheTime) {
        this.chongwuYuyueShenheTime = chongwuYuyueShenheTime;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getChongwuYuyueTime() {
        return chongwuYuyueTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setChongwuYuyueTime(Date chongwuYuyueTime) {
        this.chongwuYuyueTime = chongwuYuyueTime;
    }
    /**
	 * 设置：宠物报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：宠物报名时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
