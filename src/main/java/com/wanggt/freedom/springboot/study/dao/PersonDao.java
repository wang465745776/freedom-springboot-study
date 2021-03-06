package com.wanggt.freedom.springboot.study.dao;

import com.github.pagehelper.Page;
import com.wanggt.freedom.springboot.study.entity.PersonBean;

/**
 * 人员管理-Dao
 * @author freedom wang
 * @date 2017年08月09日09时13分
 * @since 1.0
 */
public interface PersonDao {

	/**
	 * 人员管理-查询人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public Page<PersonBean> getPersons(PersonBean bean);

	/**
	 * 人员管理-根据kid查询人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public PersonBean getPersonByKid(PersonBean bean);
	
	/**
	 * 人员管理-新增人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public int addPerson(PersonBean bean);

	/**
	 * 人员管理-修改人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public int updatePerson(PersonBean bean);

	/**
	 * 人员管理-删除人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public int deletePerson(PersonBean bean);
}
