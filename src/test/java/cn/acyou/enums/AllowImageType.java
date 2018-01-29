package cn.acyou.enums;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @author youfang
 * @date 2018-01-19 14:56
 **/
public enum AllowImageType {
    BMP,JPG,JPEG,PNG,JIF;

    public static List<String> getAllType(){
        List<String> allType = Lists.newArrayList();
        for (AllowImageType type : values()){
            allType.add(type.toString());
        }
        return  allType;

    }

}
