/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.xieyang.user.action;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

/**
 * ServletAction
 * 
 * <p>spring mvc 支持Servlet api参数的注入</p>
 *
 *
 * @author  xieyang
 * @since   1.0
 * @version 2015-11-04 xieyang
 */
@Controller
@RequestMapping("/servlet")
public class ServletAction {

	/**
	 * <p> 可直接注入request,response,session </p>
	 * <p>如果使用response，方法的返回值需设置为void</p>
	 * 
	 * @param request request
	 * @param response response
	 * @param session session
	 */
	public void get(HttpServletRequest request,HttpServletResponse response,HttpSession session){
	}
	
	/**
	 * <p>也支持注入spring封装的request</p>
	 * 
	 * @param request request
	 */
	public void list(WebRequest request){
	}
	
	/**
	 * <p>支持InputStream、OutputStream、Reader、Writer注入</p>
	 * 
	 * @param os os
	 */
	public void upload(OutputStream os){
	}
	
}
