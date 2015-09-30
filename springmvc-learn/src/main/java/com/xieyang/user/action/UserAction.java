/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.user.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xieyang.user.model.UserDTO;

/**
 * User Action
 *
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-09-25 xieyang
 */
@Controller
@RequestMapping("/user")
public class UserAction {

	
	/**
	 * @param userId userId
	 * @return String
	 */
	@RequestMapping("/get/{userId}")
	public String getUser(@PathVariable("userId") String userId){
		System.out.println("【Test】"+"userId:"+userId);
		return "userMerge";
	}
	
	/**
	 * @param model model
	 * @return String
	 */
	@RequestMapping("/update")
	public String updateUser(Model model){
		return "userList";
	}
	
	/**
	 * 添加用户
	 * 
	 * @param user 用户
	 * @return ModelAndView
	 */
	@RequestMapping("/add")
	public ModelAndView addUser(UserDTO user){
		System.out.println("【Test】test addUser method.");
		System.out.println("【Test】param user:"+user);
		user.setUserName("userName is changed");
		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject(user);//request.getAttribute("user")获取不到值
		modelAndView.addObject("user",user);
		modelAndView.setViewName("/userList");
		return modelAndView;
	}
}
