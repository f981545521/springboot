package cn.acyou.annotation;

import cn.acyou.entity.User;
import com.sun.istack.internal.Nullable;
import org.junit.Test;

import javax.validation.constraints.NotNull;
import java.util.Scanner;

/**
 * @author youfang
 * @date 2018-01-25 15:50
 * 注解测试
 **/
public class AnnotationTest {

    @Test
    @SuppressWarnings("deprecation")
    public void test1(){
        String url2 = "cpg.";
        System.out.println(url2.lastIndexOf("."));
        System.out.println(url2.length());
        test223();
        test123();
    }

    @Test
    public void test2(){
        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.next();
        testNullable(null);
    }

    private void test123(){
        System.out.println(123);
    }

    @Deprecated
    private void test223(){
        System.out.println(223);
    }

    private void testNullable(@NotNull User user){
        System.out.println(user);
        user.getName();
    }

}
