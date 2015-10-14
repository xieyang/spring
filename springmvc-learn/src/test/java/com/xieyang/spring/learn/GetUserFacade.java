/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.spring.learn;

import javax.annotation.Resource;

import com.xieyang.user.facade.UserFacade;

/**
 * 测试autowirecapabelbeanFactory
 *
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-10-14 xieyang
 */
public class GetUserFacade {

	
	/**
	 * 加注解
	 */
	@Resource
	private UserFacade userFacade;
	
	/**
	 * 未加注解
	 */
	private UserFacade facade;
	
	
	/**
	 * 
	 */
	public void getUser(){
		System.out.println("【Test】"+userFacade.getUser(""));
	}


	/**
	 * @return 获取 userFacade属性值
	 */
	public UserFacade getUserFacade() {
		return userFacade;
	}


	/**
	 * @param userFacade 设置 userFacade 属性值为参数值 userFacade
	 */
	public void setUserFacade(UserFacade userFacade) {
		this.userFacade = userFacade;
	}


	/**
	 * @return 获取 facade属性值
	 */
	public UserFacade getFacade() {
		return facade;
	}


	/**
	 * @param facade 设置 facade 属性值为参数值 facade
	 */
	public void setFacade(UserFacade facade) {
		this.facade = facade;
	}
	
	
	
}
