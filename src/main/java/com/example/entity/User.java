package com.example.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lpe234 on 2017/2/14.
 */


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    Long id;

    @Column(name = "name", nullable = false, length = 128)
    String name;

    int age;

    Date updateTime = new Date();

    boolean isActive = Boolean.TRUE;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getUpdateTime() {
        return updateTime.toLocaleString();
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
