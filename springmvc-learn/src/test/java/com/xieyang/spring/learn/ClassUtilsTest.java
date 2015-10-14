/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.spring.learn;

import org.junit.Test;
import org.springframework.util.ClassUtils;

/**
 * ClassUtils学习
 *
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-10-14 xieyang
 */
public class ClassUtilsTest {

	/**
	 * ForName
	 * 
	 * @throws Exception exception
	 */
	@Test
	@SuppressWarnings("cast")
	public void testForName() throws Exception {
		Class userDTOClass =  (Class) ClassUtils.forName("com.xieyang.user.model.UserDTO", ClassUtilsTest.class.getClassLoader());
		System.out.println(userDTOClass.getName());
	}

}
