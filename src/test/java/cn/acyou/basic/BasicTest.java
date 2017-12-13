package cn.acyou.basic;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author youfang
 * @create 2017-12-03 22:26
 */
public class BasicTest {

    @Test
    public void test1() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2015-12-11");
        System.out.println(sdf.format(date));
        System.out.println(date1);
    }

    @Test
    public void test2(){
        Integer i = 4;
        System.out.println(i instanceof Integer);
    }
}
