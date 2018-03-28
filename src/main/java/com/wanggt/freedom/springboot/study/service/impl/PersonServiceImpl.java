package com.wanggt.freedom.springboot.study.service.impl;

import com.wanggt.freedom.springboot.study.entity.PersonBean;
import com.wanggt.freedom.springboot.study.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 人员管理-ServiceImpl
 * @author freedom wang
 * @date 2018/3/2810:29
 * @since 1.0
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Override
    public List<PersonBean> getPersons() {
        return null;
    }

    @Override
    public PersonBean addPerson() {
        return null;
    }

    @Override
    public PersonBean updatePerson() {
        return null;
    }

    @Override
    public PersonBean deletePerson() {
        return null;
    }
}
