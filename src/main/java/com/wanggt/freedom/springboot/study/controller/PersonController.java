package com.wanggt.freedom.springboot.study.controller;

import com.wanggt.freedom.springboot.study.config.mybatis.DBProperties;
import com.wanggt.freedom.springboot.study.entity.PersonBean;
import com.wanggt.freedom.springboot.study.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 人员管理-Controller
 * @author freedom wang
 * @date 2018年3月28日上午10:41:21
 * @version 1.0
 */
@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@Autowired
	private DBProperties dbProperties;

	public List<PersonBean> getPersons() {
		return personService.getPersons();
	}
	
	@GetMapping("hello")
	public String hello() {
		return "Hello World" + dbProperties.getInitialSize();
	}

}
