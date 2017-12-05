package cn.acyou.basic;

import org.junit.Test;

import static java.lang.Thread.sleep;

/**
 * @author youfang
 * @date 2017-12-04 16:33
 **/
public class ThreadLocalTest {

    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<1000;i++){
                    System.out.println("R1 --->" + i);
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1000;i > 0;i--){
                    System.out.println("R2 <---" + i);
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
