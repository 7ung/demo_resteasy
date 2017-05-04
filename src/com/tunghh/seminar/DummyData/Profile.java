package com.tunghh.seminar.DummyData;

import javax.ws.rs.GET;

/**
 * Created by Stevie on 05/05/2017.
 */
public class Profile {

    private String name;
    private int age;

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
