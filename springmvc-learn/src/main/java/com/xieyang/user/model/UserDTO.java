/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.user.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * User DTO
 *
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-09-29 xieyang
 */
public class UserDTO {

	/**
	 * userID
	 */
	private String userID;
	/**
	 * userName
	 */
	private String userName;
	/**
	 * age
	 */
	private Integer age;
	/**
	 * birthday
	 */
	private Date birthday;
	/**
	 * @return 获取 userID属性值
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID 设置 userID 属性值为参数值 userID
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
	/**
	 * @return 获取 userName属性值
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName 设置 userName 属性值为参数值 userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return 获取 age属性值
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age 设置 age 属性值为参数值 age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return 获取 birthday属性值
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday 设置 birthday 属性值为参数值 birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
