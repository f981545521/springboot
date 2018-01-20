package cn.acyou.jodatime;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author youfang
 * @date 2017-12-04 14:57
 **/
public class JodaTimeDemo {

    @Test
    public void test(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
        SimpleDateFormat sdf =
                new SimpleDateFormat("E MM/dd/yyyy HH:mm:ss.SSS");
        calendar.add(Calendar.DAY_OF_MONTH, 90);
        System.out.println(sdf.format(calendar.getTime()));
    }

    @Test
    public void test1(){
        DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
        System.out.println(dateTime.plusDays(90).toString("E MM/dd/yyyy HH:mm:ss.SSS"));
    }

    @Test
    public void test2(){
        Date date = new Date();
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-dd-MM");

        DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
        System.out.println(dateTime.plusDays(90).toString("E MM/dd/yyyy HH:mm:ss.SSS"));
    }

    @Test
    public void test3(){
        Byte b = new Byte("1");
        System.out.println(b);
    }

    @Test
    public void test4(){
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toString("yyyy-MM-dd"));

//        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-dd-MM");
        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(fm.format(new Date()));
    }

    @Test
    public void test5(){
        System.out.println(new DateTime().toString("yyyy-MM-dd"));
    }

    @Test
    public void test6(){
        System.out.println(new DateTime().toString("/yyyy/MM/"));
    }

    @Test
    public void test7(){
        String url = "http://f6carzone.b0.upaiyun.com/f6-insurance/2018/01/15161682834330327.jpg";
        System.out.println(url.substring(url.indexOf("/",url.indexOf("//") + 2)));
    }
}
