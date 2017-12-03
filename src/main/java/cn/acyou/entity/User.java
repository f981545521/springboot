package cn.acyou.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author youfang
 * @create 2017-12-03 21:56
 */
public class User implements Serializable{

    private String name;
    private Integer age;
    private Date birthdate;

    public User(){

    }

    public User(String name, Integer age, Date birthdate) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthdate=" + birthdate +
                '}';
    }
}
