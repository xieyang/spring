/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 ******************************************************************************/

package com.xieyang.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * FirstServlet
 * 
 * 
 * @author 谢阳
 * @since 1.0
 * @version 2015年10月14日 谢阳
 */
public class FirstServlet extends HttpServlet {
    
    /**
     * @throws ServletException ServletException
     * @see javax.servlet.GenericServlet#init()
     */
    @Override
    public void init() throws ServletException {
        System.out.println("【Test】 InitFirst Servlet");
        super.init();
    }
    
    /**
     * @param req req
     * @param resp resp
     * @throws ServletException ServletException
     * @throws IOException IOException
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("【Test】 First Servlet doGet");
        super.doGet(req, resp);
    }
    
    /**
     * @param req req
     * @param resp resp
     * @throws ServletException ServletException
     * @throws IOException IOException
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("【Test】 First Servlet doPost");
        super.doPost(req, resp);
    }
    
}
