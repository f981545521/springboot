package cn.acyou.duplicate;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @author youfang
 * @date 2018-01-31 23:22
 **/
public class Guavatest {

    @Test
    public void test1(){
        List<String> list = Lists.newArrayList("123","234");
        System.out.println(list);
    }
    @Test
    public void test2(){
        String orderField = "idStockReturn";
        String ss = orderField.replaceAll("[A-Z]", "_$0").toLowerCase();
        System.out.println(ss);

    }
}
