/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.spring.learn;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * ClassPathResource学习
 *
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-10-12 xieyang
 */
public class ClassPathResourceTest {

	/**
	 * StringUtils的使用
	 */
	@Test
	public void testStringUtils() {
		String strPath = StringUtils.cleanPath("applicationContext.xml");
		Assert.assertEquals("applicationContext.xml", strPath);
		strPath = StringUtils.cleanPath("classpath:/xieyang\\.\\.\\applicationContext.xml");
		Assert.assertEquals("classpath:/xieyang/applicationContext.xml", strPath);
		strPath = StringUtils.cleanPath("/com/xieyang/../spring/applicationContext.xml");
		Assert.assertEquals("/com/spring/applicationContext.xml", strPath);
		strPath = StringUtils.cleanPath("/com/../spring/applicationContext.xml");
		Assert.assertEquals("/spring/applicationContext.xml", strPath);
	}

}
