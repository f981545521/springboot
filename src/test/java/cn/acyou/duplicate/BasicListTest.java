package cn.acyou.duplicate;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.*;

/**
 * @author youfang
 * @date 2017-12-27 19:38
 **/
public class BasicListTest {
    private List<Integer> integers;
    private List<Integer> preapreList() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        integers = list;
        return list;
    }
    @Test
    public void testForeach2() {
        List<Integer> list = preapreList();
        List<Integer> list2 = preapreList();
        List<Integer> list3 = preapreList();
        System.out.println(list == integers);//false
        System.out.println(list2 == integers);//false
        System.out.println(list3 == integers);//true    永远是最后一个还是以前的引用，其他的都是copy
    }

    @Test
    public void testInteger(){
        Integer a1 = Integer.valueOf(60);
        Integer b1 = 60;
        System.out.println(a1 == b1);//true

        Integer a2 = 60;
        Integer b2 = 60;
        System.out.println(a2 == b2);//true


        Integer a3 = new Integer(60);
        Integer b3 = 60;
        System.out.println(a3 == b3);//false

        //注意
        Integer a4 = 127;
        Integer b4 = 127;
        System.out.println(a4 == b4);//true

        Integer a5 = 128;
        Integer b5 = 128;
        System.out.println(a5 == b5);//false    Integer超过128就是false
        /**
         * 1、以上代码第一段和第二段旨在说明：在-128~127的Integer值并且以Integer x = value;的方式赋值的Integer值在进行==和equals比较时，都会返回true，因为Java里面对处在在-128~127之间的Integer值，用的是原生数据类型int，会在内存里供重用，也就是说这之间的Integer值进行==比较时只是进行int原生数据类型的数值比较，而超出-128~127的范围，进行==比较时是进行地址及数值比较。
         * 2、第三段旨在说明：==和equals的区别，==是进行地址及值比较，无法对==操作符进行重载，而对于equals方法，Integer里面的equals方法重写了Object的equals方法，查看Integer源码可以看出equals方法进行的是数值比较。
         */
    }

    @Test
    public void testInt(){
        int i = 1110;
        Integer j = 1110;
        System.out.println(i == j);
    }

    @Test
    public void testDouble(){
        double d1 = 1.23;
        //double d2 = null; 【判断一个double == null 是一个荒谬的事情

    }

    @Test
    public void testLong(){
        Long l = null;
        System.out.println(l.equals(null));
    }
    @Test
    public void testLong2(){
        Long l = 23456L;
        Long l2 = 2345L;
        System.out.println(l.equals(l2));
        System.out.println(l == l2);
        System.out.println(l > l2);
    }

    @Test
    public void testIntegers(){
        String val = "110221";
        String val2 = "110221";
        Integer a1 = Integer.valueOf(val);//返回值是Integer型的.
        int a2 = Integer.parseInt(val2);//返回值是int型的.
        //1.使用Integer.valueOf(0)专门用于处理对象类型的数字，虽然也可以用来处理字符串转换成数字。
        //2.建议使用Integer.parseInt("0");此方法专门用于将字符串转换成数字。
        System.out.println(a1 == a2);

    }

    @Test
    public void testInteger2(){
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    @Test
    public void testForeach() {
        List<Integer> list = preapreList();
        for (Integer num : list) {
            if (num == 9)
                list.remove(num);
        }
    }



    //会报错：使用foreach循环的时候避免进行remove操作
    @Test
    public void testForeach3() {
        List<Integer> list = preapreList();
        for (Integer num : list) {
            if (num == 1)
                list.remove(num);
        }
    }

    //不会报错
    @Test
    public void testForeach4() {
        List list = this.preapreList();
        Iterator i$ = list.iterator();
        while(i$.hasNext()) {
            Integer num = (Integer)i$.next();
            if(num.intValue() == 1) {
                //list.remove(num);
                i$.remove();
            }
        }
    }

    //不会报错
    @Test
    public void testForeach5() {

        String ss = "";

        List list = this.preapreList();
        for (int i = 0; i < list.size(); i++){
            if (i == 1){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    @Test
    public void test10(){
        List<String> stringList = new ArrayList<>(Arrays.asList("12","234"));
        List<Integer> stringList2 = ImmutableList.of(12,34);//不可改变的数组，当在尝试add、remove的时候UnsupportedOperationException
        System.out.println(stringList);
        System.out.println(stringList2);
    }

    @Test
    public void test10_1(){
        List<String> list = new ArrayList<String>(){{add("e");add("3");}};
        System.out.println(list);
    }

    @Test
    public void test11(){
        Double d1 = null;
        System.out.println(d1 == null);
    }

    @Test
    public void test12(){
        String[] packages = {"23","34"};
        System.out.println(Arrays.toString(packages));
    }
    @Test
    public void test13(){
        Double d1 = 1.23;
        Double d2 = d1 != null?d1:0.0;
        System.out.println(d2);
    }

    @Test
    public void test14(){
        Map<String,Map<String,Double>> map = new HashMap<>();
        Map<String,Double> doubleMap = new HashMap<>();
        doubleMap.put("123",9.99);
        map.put("456",doubleMap);

        Map<String,Double> doubleMap2 = new HashMap<>();
        doubleMap2.put("1234",7.99);
        map.put("456",doubleMap2);
        System.out.println(map.get("456").get("1234"));

    }

    @Test
    public void test15(){
        Map<String,Map<String,Double>> map = new HashMap<>();
        Map<String,Double> doubleMap = new HashMap<>();
        doubleMap.put("123",9.99);
        doubleMap.put("456",8.88);
        map.put("GG",doubleMap);
        System.out.println(map.get("GG").get("123"));
        System.out.println(map.get("GG").get("456"));
        map.get("GG").put("789",6.66);
        System.out.println(map.get("GG").get("789"));
    }

    @Test
    public void test16(){
        //Map<int,Double> map = new HashMap<>();
        Map map1 = new HashMap();
        int k = 2,v = 33;
        map1.put(k,v);
        System.out.println(map1);
        Integer b = 123;
        System.out.println(map1 instanceof Object);
    }
    @Test
    public void test16_1(){
        Map<Integer,Double> doubleMap = new HashMap<>();
        doubleMap.put(123,9.99);
        doubleMap.put(456,8.88);
        System.out.println(doubleMap.containsKey(123));

        Map<String,Double> map = ImmutableMap.of("234",23.45);
        System.out.println(map);
    }

    @Test
    public void test17(){
        int i = 10;
        //System.out.println(i instanceof Object);
    }

}
