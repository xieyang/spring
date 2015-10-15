/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 ******************************************************************************/

package com.xieyang.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * FirstFilter
 * 
 * 
 * @author 谢阳
 * @since 1.0
 * @version 2015年10月15日 谢阳
 */
public class FirstFilter implements Filter {
    
    /**
     * @param filterConfig filterConfig
     * @throws ServletException ServletException
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("【Test】 InitFirst Filter");
    }
    
    /**
     * @param request request
     * @param response response
     * @param chain chain
     * @throws IOException IOException
     * @throws ServletException ServletException
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse,
     *      javax.servlet.FilterChain)
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
        ServletException {
        System.out.println("【Test】First Filter doFilter");
        chain.doFilter(request, response);
    }
    
    /**
     * 
     * @see javax.servlet.Filter#destroy()
     */
    @Override
    public void destroy() {
        System.out.println("【Test】 DestroyFirst Filter");
    }
    
}
