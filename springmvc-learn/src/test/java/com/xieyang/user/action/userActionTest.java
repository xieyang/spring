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
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

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
	 * @throws Exception 异常
	 */
	@Test
	public void testAddUser() throws Exception {
		
//		这样传值后台无法获取
//		UserDTO user = new UserDTO();
//		user.setUserName("xieyang");
//		System.out.println(mvc.perform(MockMvcRequestBuilders.post("/user/add",user)).andReturn().getRequest().getAttribute("user"));
		
//		System.out.println(mvc.perform(MockMvcRequestBuilders.post("/user/add").param("userName", "xieyang")).andReturn().getRequest().getAttribute("user"));
//		System.out.println("【result】"+mvc.perform(MockMvcRequestBuilders.post("/user/add?userName=xieyang")).andReturn().getRequest().getAttribute("user"));
		ModelAndView object  = mvc.perform(MockMvcRequestBuilders.post("/user/add?userName=xieyang")).andReturn().getModelAndView();
		System.out.println("【Result】"+object.getModel());
	}
	
	/**
	 * 测试getUser方法
	 * @throws Exception 异常
	 */
	@Test
	public void testGetUser() throws Exception{
		ModelAndView result  = this.mvc.perform(MockMvcRequestBuilders.get("/user/view/123456")).andReturn().getModelAndView();
		System.out.println("【Test】view:"+result.getViewName());
		System.out.println("【Test】model:"+result.getModel());
	}
	
	/**
	 * 测试deleteUser方法
	 * @throws Exception 异常
	 */
	@Test
	public void testDeleteUser() throws Exception{
		String strViewName = this.mvc.perform(MockMvcRequestBuilders.delete("/user/delete/abc123")).andReturn().getModelAndView().getViewName();
		System.out.println("【Test】"+strViewName);
	}

}
