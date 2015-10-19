/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.spring.learn;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.core.Conventions;

import com.xieyang.user.model.UserDTO;

/**
 * conventions
 *
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-10-19 xieyang
 */
public class ConventionsTest {

	/**
	 * 
	 */
	@Test
	public void test(){
		UserDTO user = new UserDTO();
		Assert.assertEquals("string", Conventions.getVariableName("xieyang"));
		Assert.assertEquals("userDTO", Conventions.getVariableName(user));
	}
}
