package cn.acyou.jodatime;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

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
}
