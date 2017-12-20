package cn.acyou.basic;

import cn.acyou.pojo.TBoss;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Test
    public void test11(){
        List<String> list = new ArrayList<String>();
    }

    private List<String> getString(){
        return new ArrayList<String>(2);
    }

    @Test
    public void test4(){
        System.out.println("<————————————"+ "耗时：5 ms - id:com.air.tqb.mapper.base.MenuMapper.getMiddleMenuByUrl\t" +"————————————>");
        System.out.println("<—————————————————————————————————————————————————————————————————————————————————————————————>");
    }

    @Test
    public void test5(){
        String str = "insutanceCompanyName";
        System.out.println(str.replaceAll("[A-Z]", "_$0").toLowerCase());
    }

    @Test
    public void test6(){
        TBoss tBoss = new TBoss();
        tBoss.setId(1);
        tBoss.setName("小飞");
        tBoss.setAge(23);

        tBoss.setName(tBoss.getName()+tBoss.getAge());
        System.out.println(tBoss);
    }
}
