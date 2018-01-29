package cn.acyou.util;

import org.junit.Test;

/**
 * @author youfang
 * @date 2018-01-22 15:13
 **/
public class ImageUtilTest {

    @Test
    public void test1(){
        String str = "http://f6carzone.b0.upaiyun.com/f6-insurance/2018/01/15163485807840327.jpg";
        String extensionName = getFileExtension2(str);
        System.out.println(extensionName);
    }

    @Test
    public void test2(){
        String str = null;
        String extensionName = getFileExtension2(str);
        System.out.println(extensionName);
    }

    @Test
    public void test3(){

    }

    private static String getFileExtension2(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        } else {
            return "";
        }
    }
}
