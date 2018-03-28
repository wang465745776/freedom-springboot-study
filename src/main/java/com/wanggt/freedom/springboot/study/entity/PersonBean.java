package com.wanggt.freedom.springboot.study.entity;

/**
 * 人员-Bean
 *
 * @author freedom wang
 * @date 2018/3/2810:24
 * @since 1.0
 */
public class PersonBean {
    private String kid;
    private String name;
    private int age;

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
