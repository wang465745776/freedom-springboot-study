package com.wanggt.freedom.springboot.study.config.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC配置
 * @author freedom wang
 * @date 2018年3月29日下午2:38:27
 * @version 1.0
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CharacterEncodingInterceptor());
	}

}
