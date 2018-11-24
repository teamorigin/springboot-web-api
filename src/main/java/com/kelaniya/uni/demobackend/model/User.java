package com.kelaniya.uni.demobackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer ID;
    private Integer AGE;
    private String NAME;

    public Integer getId() {
        return ID;
    }

    public void setId(Integer id) {
        this.ID = id;
    }

    public String getName() {
        return NAME;
    }

    public void setName(String name) {
        this.NAME = name;
    }

    public Integer getAge() {
        return AGE;
    }

    public void setAge(Integer age) {
        this.AGE = age;
    }

}
