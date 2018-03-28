package com.wanggt.freedom.springboot.study.service;

import com.wanggt.freedom.springboot.study.entity.PersonBean;

import java.util.List;

/**
 * 人员管理-Service
 *
 * @author freedom wang
 * @date 2018 /3/2810:24
 * @since 1.0
 */
public interface PersonService {
    /**
     * 人员管理-获取人员信息
     *
     * @return the person bean
     * @author freedom wang
     * @since 1.0
     */
    public List<PersonBean> getPersons();

    /**
     * 人员管理-新增人员
     *
     * @return the person bean
     * @author freedom wang
     * @since 1.0
     */
    public PersonBean addPerson();

    /**
     * 人员管理-修改人员
     *
     * @return the person bean
     * @author freedom wang
     * @since 1.0
     */
    public PersonBean updatePerson();

    /**
     * 人员管理-删除人员
     *
     * @return the person bean
     * @author freedom wang
     * @since 1.0
     */
    public PersonBean deletePerson();
}
