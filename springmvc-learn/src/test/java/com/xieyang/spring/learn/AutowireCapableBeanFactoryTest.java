/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.spring.learn;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AutowireCapableBeanFactory
 *
 *<p>
 *	如何让不受spring管理的类具有spring自动注入的特性．
 *</p>
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-10-14 xieyang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AutowireCapableBeanFactoryTest {

	/**
	 * context
	 */
	@Autowired
	ApplicationContext context;
	
	/**
	 * 
	 */
	@Test
	public void test() {
		//GetUserFacade类并未纳入spring容器管理，但需要使用@Resource注入Springbean
		GetUserFacade objFacade = context.getAutowireCapableBeanFactory().createBean(GetUserFacade.class);
		//获取的objFacade已经注入好了
		objFacade.getUser();
		//没有加@Resource注解的属性没有注入
		Assert.assertEquals(objFacade.getFacade(), null);
		//但并不意味GetUserFacade会纳入spring容器管理
//		System.out.println("【Test】"+context.getBean(GetUserFacade.class));
		
		GetUserFacade facade = new GetUserFacade();
		Assert.assertEquals(facade.getFacade(), null);
		context.getAutowireCapableBeanFactory().autowireBeanProperties(facade, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true);
		//没有加@Resource注解的属性已经注入好了
		Assert.assertNotNull(facade.getFacade());
	}

}
