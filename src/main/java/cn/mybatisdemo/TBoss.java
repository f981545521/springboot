package cn.mybatisdemo;

import java.io.Serializable;

/**
 * @author youfang
 * @date 2017-12-06 14:19
 **/
public class TBoss implements Serializable{
    private Integer id;
    private String name;
    private Integer age;

    public TBoss(){
        System.out.println("注意：开始newTBoss");
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("注意：开始setid");
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TBoss{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
