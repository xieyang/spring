/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.user.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xieyang.user.UserConstants;
import com.xieyang.user.model.UserDTO;

/**
 * User Action
 * 
 * <p>标准的请求方式</p>
 * <p>
 * 	类名、文件名尽可能清楚，方便查找</br>
 * 	方法名尽可能简单明了</br>
 * </p>
 * <p>
 * 	@RequestParam 请求的参数绑定入参
 *  @RequestHeader 请求报文绑定入参
 *  @CookieValue cookie绑定入参数
 * </p>
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-09-25 xieyang
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	
	/**
	 * 初始化user参数
	 * 
	 * <p>
	 * 	该方法为了测试@ModelAttribute的使用
	 * </p>
	 * 
	 * @return UserDTO
	 */
//	@ModelAttribute("user")
//	public UserDTO initUser(){
//		UserDTO userDTO = new UserDTO();
//		userDTO.setUserName("xy");
//		return userDTO;
//	}
	
	/**
	 * 进入首页
	 * 
	 * <p>首页常用词汇：index</p>
	 * 
	 * @return String
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "/user/userIndex";
	}
	
	
	/**
	 * 列表
	 * 
	 * <p>列表展示常用词汇：query、list、count</p>
	 * <p>RequestMapping可通过params,headers根据精准定位请求</p>
	 * <p>params="username=xieyang"</p>
	 * <p>params={"username!=xieyang","sex=woman"}</p>
	 * <p>headers指定报文头</p>
	 * <p>headers="content-type=text/*"</p>
	 * 
	 * @param condition condition
	 * @return String
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET,params="username")
	public String list(UserDTO condition){
		//TODO 如何模拟数据
		return "/user/userList";
	}
	
	
	/**
	 * 
	 * <p>查看常用词汇：view、get</p>
	 * 
	 * <p>
	 * 	springmvc在调用方法之前会创建一个隐含数据模型对象，
	 * 	如果方法参数是Model、Map、ModelMap，spingmvc
	 *  会将该隐含数据模型对象的引用传入給这些类型
	 * </p>
	 * 
	 * @param userId userId
	 * @param model model
	 * @return String
	 */
	@RequestMapping(value = "/view/{userId}",method=RequestMethod.GET)
	public String view(@PathVariable("userId") String userId,ModelMap model){
		System.out.println("【Test】"+"userId:"+userId);
		model.addAttribute("user", new UserDTO());
		model.put("operation", UserConstants.READONLY);
		return "/user/userEdit";
	}
	
	/**
	 * 进入编辑
	 * 
	 * @param user user
	 * @param model model
	 * @return String
	 */
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String updatePage(@ModelAttribute("user")UserDTO user,ModelMap model){
//	public String update(UserDTO user){//即使user参数没有@ModelAttribute注解，也会将该user放入到model中，key是userDTO
		user.setAge(21);
		System.out.println("【Test】"+user);
		System.out.println("【Test】"+model);
		model.addAttribute("operation",UserConstants.UPDATE);
		return "/user/userEdit";
	}
	
	/**
	 * 编辑
	 * 
	 * <p>
	 * 	修改常用词汇：edit、update、merge
	 * 	@ModelAttribute 注解后的参数将会加入到model中
	 * 	@ModelAttribute 该注解也可注解方法；注解后的方法的返回值会加入到model中；该方法在调用处理请求方法之前调用。
	 * </p>
	 * 
	 * @param user user
	 * @param model model
	 * @return String
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute("user")UserDTO user,ModelMap model){
		return "/user/userList";
	}
	
	/**
	 * 进入新增
	 * 
	 * @param user user
	 * @param model model
	 * @return String
	 */
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addPage(UserDTO user,ModelMap model){
		model.put("operation", UserConstants.ADD);
		return "/user/userEdit";
	}
	
	/**
	 * 添加
	 * 
	 * <p>新增常用词汇：add、save、create</p>
	 * 
	 * @param user user
	 * @param model model
	 * @return String 
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
//	public ModelAndView add(UserDTO user){
	public String add(UserDTO user,ModelMap model){
		System.out.println("【Test】user:"+user);
		return "/user/userList";
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject(user);//request.getAttribute("user")获取不到值
//		modelAndView.addObject("user",user);
//		modelAndView.setViewName("/user/userList");
//		return modelAndView;
	}
	
	/**
	 * 删除
	 * 
	 * <p>使用HTTP标准的请求方式 get post put delete</p>
	 * <p>表单需使用post请求，使用"_method"指定那种请求</p>
	 * @param userId userId
	 * @return view
	 */
	@RequestMapping(value="/delete/{userId}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("userId") String userId){
		System.out.println("【Test】test deleteUser method");
		System.out.println("【Test】param userId:"+userId);
		return "/user/userList";
	}
	
}
