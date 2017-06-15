package com.learn.model;

import java.io.Serializable;

/**
 * Created by admin on 2017/6/14.
 */
public class Person implements Serializable {

    private String id;
    private String name;
    private Integer age;


    /**
     * JackSon做序列化是需要一个空的构造
     */
    public Person() {
    }

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
