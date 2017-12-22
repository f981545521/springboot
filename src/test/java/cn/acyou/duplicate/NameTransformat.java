package cn.acyou.duplicate;

import org.junit.Test;

/**
 * @author youfang
 * @date 2017-12-20 19:17
 **/
public class NameTransformat {

    @Test
    public void test1(){
        String ss = "pkId, code, name, contacts, contactNumber, province, city, area, street, address, detailAddress, email, parentId, isDelete, entityCode, creationTime, modifiedTime, creater, modifier, bussiness, logo, storeLogo, applicationLogo, responsible, zipCode, contactMobile, fax, endDate, qq, bankAccount, accountNumber, openTime, closeTime, positionX, positionY, idCustomerCarzone, idDepartmentCarzone, isTaskModeEnable, abbreviation, needScanLogin, needCheckUuid, uuidCountLimit, fromFlag, isAheadGatheringEnable";
        String[] strings = ss.split(",");
        StringBuffer sb = new StringBuffer();
        for (String s : strings){
            String newString = NameTransformat.camelToUnderline(s);
            sb.append(newString + ",");
        }
        System.out.println(sb);

    }

    @Test
    public void test2(){
        String ss = "pk_id, code, name, contacts, contact_number, province, city, area, street, address, detail_address, email, parent_id, is_delete, entity_code, creation_time, modified_time, creater, modifier, bussiness, logo, store_logo, application_logo, responsible, zip_code, contact_mobile, fax, end_date, qq, bank_account, account_number, open_time, close_time, position_x, position_y, id_customer_carzone, id_department_carzone, is_task_mode_enable, abbreviation, need_scan_login, need_check_uuid, uuid_count_limit, from_flag, is_ahead_gathering_enable";
        String[] strings = ss.split(",");
        StringBuffer sb = new StringBuffer();
        for (String s : strings){
            String newString = NameTransformat.underlineToCamel(s);
            sb.append(newString + ",");
        }
        System.out.println(sb);
    }

    private static final char UNDERLINE='_';
    private static String camelToUnderline(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (Character.isUpperCase(c)){
                sb.append(UNDERLINE);
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    private static String underlineToCamel(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (c==UNDERLINE){
                if (++i<len){
                    sb.append(Character.toUpperCase(param.charAt(i)));
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
