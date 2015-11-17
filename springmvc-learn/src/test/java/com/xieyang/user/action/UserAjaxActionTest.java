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
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * UserAjaxAction Test
 * 
 * 
 * @author xieyang
 * @since 1.0
 * @version 2015-11-17 xieyang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/webmvc-servlet.xml")
public class UserAjaxActionTest {

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
	 * init
	 */
	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	/**
	 * test view method
	 * @throws Exception exception
	 */
	@Test
	public void testView() throws Exception {
		mvc.perform(
				MockMvcRequestBuilders.get("/api/user/view/123456")
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(
						MockMvcResultMatchers.content().contentType(
								MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print());
//				.andReturn();
	}
	
	
}
