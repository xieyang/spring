/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.user.action;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * userAction Test
 *
 *<p> @WebAppConfiguration来标明是web应用测试</p>
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-09-29 xieyang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/webmvc-servlet.xml")
//@ContextConfiguration("/WEB-INF/webmvc-servlet.xml") 这么配置找不到文件
public class userActionTest {
	
	/**
	 * context
	 */
	@Autowired
	WebApplicationContext context;
	
	/**
	 * mvc
	 */
	MockMvc mvc;
	
	/**
	 * 初始化
	 */
	@Before
	public void setUp(){
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	/**
	 * addUser方法测试
	 */
	@Test
	public void testAddUser() {
		
	}

}
