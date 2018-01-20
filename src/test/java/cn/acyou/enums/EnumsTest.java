package cn.acyou.enums;

import org.junit.Test;

import java.util.List;

/**
 * @author youfang
 * @date 2018-01-19 15:06
 **/
public class EnumsTest {
    @Test
    public void test1(){
        List<String> list = AllowImageType.getAllType();
        System.out.println(list.contains("Png"));
    }

}
