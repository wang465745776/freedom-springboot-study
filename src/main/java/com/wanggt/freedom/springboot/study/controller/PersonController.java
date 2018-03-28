package com.wanggt.freedom.springboot.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.wanggt.freedom.springboot.study.entity.PersonBean;
import com.wanggt.freedom.springboot.study.service.PersonService;
import com.wanggt.freedom.springboot.study.util.json.JSONUtil;

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

	@GetMapping("getPersons")
	public PageInfo<PersonBean> getPersons(String data) {
		PersonBean bean = JSONUtil.parse(data, PersonBean.class);
		return personService.getPersons(bean);
	}
}
