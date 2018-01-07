package cn.acyou.duplicate;

/**
 * @author youfang
 * @date 2018-01-03 21:44
 **/
public class TestAutoBoxCache {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);

        Integer c = 1001;
        Integer d = 1001;
        System.out.println(c == d);

        Integer e = 20000;
        Integer f = 20000;
        System.out.println(e == f);
    }
}
