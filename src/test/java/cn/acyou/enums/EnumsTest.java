package cn.acyou.enums;

import cn.acyou.entity.User;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.models.auth.In;
import org.antlr.v4.runtime.misc.Nullable;
import org.junit.Test;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

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

    @Test
    public void test1_1(){
        AllowImageType[] allowImageTypes = AllowImageType.values();
        List<String> strings = Lists.transform(Arrays.asList(allowImageTypes), new Function<AllowImageType, String>() {
            @Override
            public String apply(AllowImageType input) {
                return input.toString();
            }
        });
        System.out.println(Arrays.asList(allowImageTypes));
        
    }

    @Test
    public void test2(){
        AllowImageType[] allowImageType = AllowImageType.values();
        List<AllowImageType> a = Arrays.asList(allowImageType);
        System.out.println(allowImageType);
        System.out.println(a);
        System.out.println(a.contains(1));
    }

    @Test
    public void test3(){
        List<String> allowImages = AllowImageType.getAllType();
        String message = allowImages.toString();
        System.out.println(message);
        System.out.println(allowImages.size());
    }

    @Test
    public void test4(){
        File file = new File("C:\\Users\\youfang\\Pictures\\upload\\1236.jpg");
        System.out.println(file.exists());
        System.out.println(file.length());
    }

    @Test
    public void test5(){
        User user1 = new User("张三",23,new Date());
        User user2 = new User("李四",24,new Date());
        User user3 = new User("王五",25,new Date());
        //User user5 = null;
        User user4 = new User("小六",26,new Date());
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        //userList.add(user5);
        Map<String,User> userMap = Maps.uniqueIndex(userList, new Function<User, String>() {
            @Override
            public String apply(User input) {
                return input.getName();
            }
        });
        System.out.println(userMap);
    }

    @Test
    public void test5_1(){
        User user1 = new User("张三",23,new Date());
        User user2 = new User("李四",24,new Date());
        User user3 = new User("王五",25,new Date());
        User user4 = new User("小六",26,new Date());
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        List<String> nameList = Lists.transform(userList, new Function<User, String>() {
            @Override
            public String apply(User input) {
                return input.getName();
            }
        });
        System.out.println(nameList);


    }
    @Test
    public void test6(){
        Double a = 0.1;
        BigDecimal decimal = new BigDecimal(a);
        BigDecimal decimal2 = new BigDecimal(String.valueOf(a));
        BigDecimal decimal3 = BigDecimal.valueOf(a);
        System.out.println(decimal);//0.1000000000000000055511151231257827021181583404541015625
        System.out.println(decimal2);//0.1
        System.out.println(decimal3);//0.1
    }

    @Test
    public void test6_1(){
        System.out.println(0.05+0.01);//0.060000000000000005
        BigDecimal decimal1 = new BigDecimal(String.valueOf(0.05));
        BigDecimal decimal2 = new BigDecimal(String.valueOf(0.01));
        System.out.println(decimal1.add(decimal2));//0.06
    }

    @Test
    public void test6_2(){
        BigDecimal bigDecimal = BigDecimal.valueOf(0.25);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.doubleValue());
    }

    @Test
    public void test7(){
        String url = "http://f6carzone.b0.upaiyun.com/f6-insurance/2018/01/15163485807840327.jpg";
        System.out.println(url.contains("//"));
        String path = url.substring(url.indexOf("/",url.indexOf("//") + 2));
        System.out.println(path);

    }

    @Test
    public void test8(){
        String url = "http://f6carzone.b0.upaiyun.com/f6-insurance/2018/01/15163485807840327.jpg";
        System.out.println(url.contains("//"));
        String path = url.substring(url.indexOf("/",url.indexOf("//") + 2));
        System.out.println(path);
    }



    @Test
    public void test10(){
        Map<Integer,Double> map = Maps.newHashMap();
        map.put(1,2.23);
        map.put(2,3.34);
        Set<Integer> keySet = map.keySet();
        Set<Map.Entry<Integer,Double>> entrySet = map.entrySet();
        for (Map.Entry<Integer,Double> set : entrySet){
            System.out.println(set.getValue());
        }
        //Joiner.on();
        String orderField = "tsInsuranceCompany";
        String od = orderField.replaceAll("[A-Z]+", "_$0");
        Joiner.on("_$0");
        System.out.println(od);

        System.out.println(Splitter.on('|').split("foo|bar|baz"));


    }

    @Test
    public void test11(){
        String sql = "SELECT * FROM tm_part_info_detail WHERE pk_id IN (SELECT id_part FROM ts_stock_return_detail WHERE id_stockreturn = '10545847757464145546');";
        String formatSql = sql.replaceAll("WHERE","\t\t\n$0");
        System.out.println(formatSql);
    }




}
