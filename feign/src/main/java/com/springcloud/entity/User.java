package com.springcloud.entity;

import java.io.Serializable;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 16:40 2019/4/9
 * @Modified By:
 */
public class User implements Serializable {
    private String name;
    private Integer age;

    //序列化传输的时候必须要有空构造方法，不然会出错
    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
