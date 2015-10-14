/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.user.facade;

import org.springframework.stereotype.Service;

import com.xieyang.user.model.UserDTO;

/**
 * userFacade
 *
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-10-14 xieyang
 */
@Service
public class UserFacade {

	/**
	 * 查询user
	 * 
	 * @param userId userId
	 * @return UserDTO
	 */
	public UserDTO getUser(String userId){
		return new UserDTO();
	}
}
