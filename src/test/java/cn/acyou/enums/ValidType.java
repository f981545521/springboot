package cn.acyou.enums;

/**
 * @author youfang
 * @date 2018-01-22 10:31
 **/
public enum  ValidType {
    BMP("BMP"),
    JPG("JPG"),
    JPEG("JPEG"),
    PNG("PNG"),
    GIF("GIF");
    private String name;

    ValidType(){

    }

    ValidType(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
