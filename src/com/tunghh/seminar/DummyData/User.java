package com.tunghh.seminar.DummyData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stevie on 05/05/2017.
 */
public class User {

    public static List<User> collections = new ArrayList<User>();
    static {
        collections.add(new User("tunghh", "123", "Tùng", 212 ));
        collections.add(new User("luannt", "678", "Luận", 69 ));
        collections.add(new User("phuhnt", "065", "Phú", 12 ));
        collections.add(new User("tienlv", "8789", "Tiên", 04 ));
    }

    private String username;
    private String password;
    private Profile profile;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }


    public User(){}
    public User(String username, String password, String name, int age){
        this.username = username;
        this.password = password;
        this.profile = new Profile();
        this.profile.setName(name);
        this.profile.setAge(age);
    }

}
