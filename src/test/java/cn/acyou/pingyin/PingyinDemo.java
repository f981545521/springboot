package cn.acyou.pingyin;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * 汉字转换为拼音
 * @author Red
 */
public class PingyinDemo {
    /**
     * 测试main方法
     * @param args
     */
    public static void main(String[] args) {
    	List<String> messages = new ArrayList<String>();
    	messages.add("车船税");
    	messages.add("交强险");
    	messages.add("车辆损失险");
    	messages.add("第三者责任险");
    	messages.add("盗抢险");
    	messages.add("玻璃破碎险");
    	messages.add("无过失责任险");
    	messages.add("车身划痕险");
    	messages.add("不计免赔特约险");
    	messages.add("自燃险");
    	messages.add("涉水险");
    	messages.add("车上人员责任险");
    	messages.add("停驶损失险");
    	messages.add("车上货物责任险");
    	messages.add("无法找到第三方");
       	for(String s : messages){
       		System.out.println(ToPinyin(s)+","+ToFirstChar(s).toLowerCase()+","+s);
       	}
    }
    /**
     * 获取字符串拼音的第一个字母
     * @param chinese
     * @return
     */
    public static String ToFirstChar(String chinese){         
        String pinyinStr = "";  
        char[] newChar = chinese.toCharArray();  //转为单个字符
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat(); 
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);  
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);  
        for (int i = 0; i < newChar.length; i++) {  
            if (newChar[i] > 128) {  
                try {  
                    pinyinStr += PinyinHelper.toHanyuPinyinStringArray(newChar[i], defaultFormat)[0].charAt(0);  
                } catch (BadHanyuPinyinOutputFormatCombination e) {  
                    e.printStackTrace();  
                }  
            }else{  
                pinyinStr += newChar[i];  
            }  
        }  
        return pinyinStr;  
    }  
   
    /**
     * 汉字转为拼音
     * @param chinese
     * @return
     */
    public static String ToPinyin(String chinese){          
        String pinyinStr = "";  
        char[] newChar = chinese.toCharArray();  
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();  
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);  
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);  
        for (int i = 0; i < newChar.length; i++) {  
            if (newChar[i] > 128) {  
                try {  
                    pinyinStr += PinyinHelper.toHanyuPinyinStringArray(newChar[i], defaultFormat)[0];  
                } catch (BadHanyuPinyinOutputFormatCombination e) {  
                    e.printStackTrace();  
                }  
            }else{  
                pinyinStr += newChar[i];  
            }  
        }  
        return pinyinStr;  
    }  
}