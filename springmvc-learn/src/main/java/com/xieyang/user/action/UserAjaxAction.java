/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.user.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xieyang.user.model.UserDTO;

/**
 * User Action
 * 
 * <p>标准Restful的请求方式</p>
 * 
 * <p>使用HTTP标准的请求方式 get post put delete</p>
*  <p>表单需使用post请求，使用"_method"指定那种请求</p>
*  <p>spring mvc的URL支持Ant风格，即**，*，？模糊匹配</p>
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-10-16 xieyang
 */
@Controller
@RequestMapping("/api/user")
public class UserAjaxAction {

	
	/**
	 * 
	 * <p>查看常用词汇：view、get</p>
	 * 
	 * @param userId userId
	 * @return String
	 */
	@RequestMapping(value = "/view/{userId}",method=RequestMethod.GET)
	public String view(@PathVariable("userId") String userId){
		System.out.println("【Test】"+"userId:"+userId);
		return "userMerge";
	}
	
	/**
	 * <p>修改常用词汇：edit、update</p>
	 * 
	 * @param model model
	 * @return String
	 */
	@RequestMapping("/update")
	public String update(Model model){
		return "userList";
	}
	
	/**
	 * 添加用户
	 * 
	 * <p>新增常用词汇：add、save、create</p>
	 * 
	 * @param user 用户
	 * @return ModelAndView
	 */
	@RequestMapping("/add")
	public ModelAndView add(UserDTO user){
		System.out.println("【Test】test addUser method.");
		System.out.println("【Test】param user:"+user);
		user.setUserName("userName is changed");
		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject(user);//request.getAttribute("user")获取不到值
		modelAndView.addObject("user",user);
		modelAndView.setViewName("/userList");
		return modelAndView;
	}
	
	/**
	 * 删除用户
	 * 
	 * @param userId userId
	 * @return view
	 */
	@RequestMapping(value="/delete/{userId}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("userId") String userId){
		System.out.println("【Test】test deleteUser method");
		System.out.println("【Test】param userId:"+userId);
		return "userList";
	}
	
	
	/**
	 * 查询用户数据
	 * 
	 * <p>列表展示常用词汇：query、list、count</p>
	 * 
	 * @param condition condition
	 * @return List
	 */
	@RequestMapping(value="/query",method=RequestMethod.GET,params={"username"})
	public List<UserDTO> list(UserDTO condition){
		return new ArrayList<UserDTO>();
	}
	
}
