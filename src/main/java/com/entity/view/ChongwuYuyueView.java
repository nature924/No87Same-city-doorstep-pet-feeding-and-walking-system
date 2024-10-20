package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChongwuYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 宠物预约
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chongwu_yuyue")
public class ChongwuYuyueView extends ChongwuYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 报名状态的值
	*/
	@ColumnInfo(comment="报名状态的字典表值",type="varchar(200)")
	private String chongwuYuyueYesnoValue;

	//级联表 宠物
		/**
		* 宠物名称
		*/

		@ColumnInfo(comment="宠物名称",type="varchar(200)")
		private String chongwuName;
		/**
		* 宠物编号
		*/

		@ColumnInfo(comment="宠物编号",type="varchar(200)")
		private String chongwuUuidNumber;
		/**
		* 宠物照片
		*/

		@ColumnInfo(comment="宠物照片",type="varchar(200)")
		private String chongwuPhoto;
		/**
		* 宠物地点
		*/

		@ColumnInfo(comment="宠物地点",type="varchar(200)")
		private String chongwuAddress;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 宠物类型
		*/
		@ColumnInfo(comment="宠物类型",type="int(11)")
		private Integer chongwuTypes;
			/**
			* 宠物类型的值
			*/
			@ColumnInfo(comment="宠物类型的字典表值",type="varchar(200)")
			private String chongwuValue;
		/**
		* 宠物介绍
		*/

		@ColumnInfo(comment="宠物介绍",type="longtext")
		private String chongwuContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer chongwuDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public ChongwuYuyueView() {

	}

	public ChongwuYuyueView(ChongwuYuyueEntity chongwuYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 报名状态的值
	*/
	public String getChongwuYuyueYesnoValue() {
		return chongwuYuyueYesnoValue;
	}
	/**
	* 设置： 报名状态的值
	*/
	public void setChongwuYuyueYesnoValue(String chongwuYuyueYesnoValue) {
		this.chongwuYuyueYesnoValue = chongwuYuyueYesnoValue;
	}


	//级联表的get和set 宠物

		/**
		* 获取： 宠物名称
		*/
		public String getChongwuName() {
			return chongwuName;
		}
		/**
		* 设置： 宠物名称
		*/
		public void setChongwuName(String chongwuName) {
			this.chongwuName = chongwuName;
		}

		/**
		* 获取： 宠物编号
		*/
		public String getChongwuUuidNumber() {
			return chongwuUuidNumber;
		}
		/**
		* 设置： 宠物编号
		*/
		public void setChongwuUuidNumber(String chongwuUuidNumber) {
			this.chongwuUuidNumber = chongwuUuidNumber;
		}

		/**
		* 获取： 宠物照片
		*/
		public String getChongwuPhoto() {
			return chongwuPhoto;
		}
		/**
		* 设置： 宠物照片
		*/
		public void setChongwuPhoto(String chongwuPhoto) {
			this.chongwuPhoto = chongwuPhoto;
		}

		/**
		* 获取： 宠物地点
		*/
		public String getChongwuAddress() {
			return chongwuAddress;
		}
		/**
		* 设置： 宠物地点
		*/
		public void setChongwuAddress(String chongwuAddress) {
			this.chongwuAddress = chongwuAddress;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}
		/**
		* 获取： 宠物类型
		*/
		public Integer getChongwuTypes() {
			return chongwuTypes;
		}
		/**
		* 设置： 宠物类型
		*/
		public void setChongwuTypes(Integer chongwuTypes) {
			this.chongwuTypes = chongwuTypes;
		}


			/**
			* 获取： 宠物类型的值
			*/
			public String getChongwuValue() {
				return chongwuValue;
			}
			/**
			* 设置： 宠物类型的值
			*/
			public void setChongwuValue(String chongwuValue) {
				this.chongwuValue = chongwuValue;
			}

		/**
		* 获取： 宠物介绍
		*/
		public String getChongwuContent() {
			return chongwuContent;
		}
		/**
		* 设置： 宠物介绍
		*/
		public void setChongwuContent(String chongwuContent) {
			this.chongwuContent = chongwuContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getChongwuDelete() {
			return chongwuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setChongwuDelete(Integer chongwuDelete) {
			this.chongwuDelete = chongwuDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "ChongwuYuyueView{" +
			", chongwuYuyueYesnoValue=" + chongwuYuyueYesnoValue +
			", chongwuName=" + chongwuName +
			", chongwuUuidNumber=" + chongwuUuidNumber +
			", chongwuPhoto=" + chongwuPhoto +
			", chongwuAddress=" + chongwuAddress +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", chongwuContent=" + chongwuContent +
			", chongwuDelete=" + chongwuDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
