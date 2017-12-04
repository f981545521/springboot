package cn.acyou.pojo;

public class TEmp {
    private Integer id;

    private String name;

    private Integer age;

    private Integer idBoss;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIdBoss() {
        return idBoss;
    }

    public void setIdBoss(Integer idBoss) {
        this.idBoss = idBoss;
    }
}