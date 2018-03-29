package com.wanggt.freedom.springboot.study.config.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 编码拦截器，用于设置编码为UTF-8
 * 
 * @author freedom wang
 * @date 2018年3月29日下午2:29:46
 * @version 1.0
 */
public class CharacterEncodingInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		System.out.println("编码拦截器：preHandle");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("编码拦截器：postHandle");
		response.setCharacterEncoding("UTF-8");
	}
}
