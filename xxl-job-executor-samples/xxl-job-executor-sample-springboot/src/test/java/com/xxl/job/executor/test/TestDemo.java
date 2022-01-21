package com.xxl.job.executor.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.common.protocol.types.Field;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.StringUtil;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.events.Event;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class TestDemo {

    @Test
    public void test4() throws IOException {
        File file = new File("E:\\test1\\test2\\demo.txt");
        System.out.println(file.exists());
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }


    @Test
    public void test11(){
//        Integer num = null;
//        System.out.println(num == 1);
//        System.out.println(Integer.parseInt(null));
////        System.out.println(null != null);
//
        Map<String, List<String>> map = new HashMap<>();
        map.put("aa",null);
        System.out.println(map.get("bb"));
//        map.put("aa",new ArrayList<>());
//        System.out.println(map.get("bb").size());
//        System.out.println(map.get("aa") != null ? map.get("aa").size() : 0 );
//        System.out.println(map.containsKey("aa"));
//        System.out.println(map.containsKey("bb"));
//        System.out.println(StringUtils.isBlank(map.get("aa").toString()));
//        String str = "";
//        System.out.println(str.length());
//        System.out.println();

          /* List<Map<String, Object>> lists = new ArrayList<>();
           HashMap<String, Object> map1 = new HashMap<>();
           map1.put("id","1");
           map1.put("name","name1");
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("id","2");
            map2.put("name","name2");
        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("id","2");
        map3.put("name","name3");
            lists.add(map1);
            lists.add(map2);
            lists.add(map3);
            Map<Object, List<Map<String, Object>>> result = lists.stream().collect(Collectors.groupingBy(item -> item.get("id")));
        System.out.println(result);*/
    }

    @Test
    public void test2(){
//        System.out.println(-12-1);
        String[] strs = new String[10];
        String str = "[aa,]";
        strs = str.replaceAll("\\[","").replaceAll("]","").split(",");
    }

    @Test
    public void test3(){
        Integer num =  new Random(5).nextInt();
//        Byte num2 = null;
        Integer num2 = 500;
        System.out.println(num2 == 500);
        Integer num3 = null;
        System.out.println("1".equals(num3));
    }

    @Test
    public void test5(){
/*        Object num  = "00000";
        System.out.println(num.equals("00000"));*/

//        List<String> strs = null;
        List<String> strs = new ArrayList<>();
        strs.stream().map(str -> {return str + 1;});
    }

    @Test
    public void test6(){
//        System.out.println(String.format("id is %s",90));
//        Integer num = null;
//        System.out.println(num == 1);
//
//        Random random = new Random();
//        random.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0 ; i < 10 ; i++){
            stringBuilder.append(random.nextInt(10));
        }
        System.out.println("12313" + stringBuilder.toString());
    }

    @Test
    public void test9(){

        try {
            System.out.println("外层try...catch");
            try {
                int num = 1/0;
            }catch (Exception e){
                System.out.println(e);
                System.out.println("1111111");
            }
            System.out.println("22222222222");
        } catch (Exception e) {
            System.out.println("外层try...catch异常");
            e.printStackTrace();
        }
    }

    @Test
    public void test7(){
        List<Integer> list = Arrays.asList(2, 3, 1, 7, 8, 9);
        List<Integer> list1 = Arrays.asList(3, 9);
        List<Integer> list2 = Arrays.asList(2);
//        List<Integer> result = list.stream().filter(num -> {
//           if (!list1.contains(num) || !list2.contains(num)){
//              return true;
//           }
//           return false;
//        }
//            ).collect(Collectors.toList());
        List<Integer> result = list.stream().filter(num -> !list1.contains(num)).filter(num -> !list2.contains(num)).collect(Collectors.toList());
        System.out.println(result);

    }

    @Test
    public void test10(){
        Map<String, String> map = new HashMap<>();
        map.put("aa","aa");
        System.out.println(map.get("aa"));
        map.put("aa","bb");
        System.out.println(map.get("aa"));
    }

    @Test
    public void test12(){
        String data = " {\n" +
                "        \"SUB_CODE\": \"0000\",\n" +
                "        \"RSP_DESC\": \"执行成功!\",\n" +
                "        \"DATA\": [\n" +
                "            {\n" +
                "                \"USER_RELATION\": [\n" +
                "                    {\n" +
                "                        \"PRIMARY_PROVINCE_CODE\": \"18\",\n" +
                "                        \"MEM_USER_ID\": \"1818030307688108\",\n" +
                "                        \"BILLING_ADD_TAG\": \"1\",\n" +
                "                        \"MEM_SHORT_NUM\": \"\",\n" +
                "                        \"PRIMARY_EPARCHY_CODE\": \"0311\",\n" +
                "                        \"PRIMARY_ROLE_CODE\": \"0\",\n" +
                "                        \"END_DATE\": \"2047-07-17 10:19:27\",\n" +
                "                        \"START_DATE\": \"2020-03-01 00:00:00\",\n" +
                "                        \"UPDATE_TIME\": \"2021-11-15 13:36:01\",\n" +
                "                        \"PRIMARY_USER_ID\": \"1820022906857771\",\n" +
                "                        \"MEM_EPARCHY_CODE\": \"0311\",\n" +
                "                        \"MEM_SERIAL_NUMBER\": \"13111520115\",\n" +
                "                        \"DISCNT_PRIORITY\": \"1\",\n" +
                "                        \"MEM_PROVINCE_CODE\": \"18\",\n" +
                "                        \"PRIMARY_SERIAL_NUMBER\": \"0311XN20108964592\",\n" +
                "                        \"BILLING_MEM_ROLE_CODE\": \"8004\",\n" +
                "                        \"RELATION_TYPE_CODE\": \"8930\",\n" +
                "                        \"MEM_ROLE_CODE\": \"1\",\n" +
                "                        \"REL_ITEM_ID\": \"1820022990843942\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"PRIMARY_PROVINCE_CODE\": \"18\",\n" +
                "                        \"MEM_USER_ID\": \"1818030307688108\",\n" +
                "                        \"BILLING_ADD_TAG\": \"1\",\n" +
                "                        \"MEM_SHORT_NUM\": \"\",\n" +
                "                        \"PRIMARY_EPARCHY_CODE\": \"0311\",\n" +
                "                        \"PRIMARY_ROLE_CODE\": \"0\",\n" +
                "                        \"END_DATE\": \"2050-12-31 23:59:59\",\n" +
                "                        \"START_DATE\": \"2020-04-01 00:00:00\",\n" +
                "                        \"UPDATE_TIME\": \"2021-11-15 13:36:01\",\n" +
                "                        \"PRIMARY_USER_ID\": \"1818030307688108\",\n" +
                "                        \"MEM_EPARCHY_CODE\": \"0311\",\n" +
                "                        \"MEM_SERIAL_NUMBER\": \"13111520115\",\n" +
                "                        \"DISCNT_PRIORITY\": \"-1\",\n" +
                "                        \"MEM_PROVINCE_CODE\": \"18\",\n" +
                "                        \"PRIMARY_SERIAL_NUMBER\": \"13111520115\",\n" +
                "                        \"BILLING_MEM_ROLE_CODE\": \"9001\",\n" +
                "                        \"RELATION_TYPE_CODE\": \"ZF\",\n" +
                "                        \"MEM_ROLE_CODE\": \"1\",\n" +
                "                        \"REL_ITEM_ID\": \"1820030215485522\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"USER_PRODUCT\": [\n" +
                "                    {\n" +
                "                        \"PRIMARY_USER_ID\": \"-1\",\n" +
                "                        \"PRODUCT_MODE\": \"01\",\n" +
                "                        \"BRAND_CODE\": \"4G00\",\n" +
                "                        \"PROD_ITEM_ID\": \"1820030294713128\",\n" +
                "                        \"EPARCHY_CODE\": \"0311\",\n" +
                "                        \"USER_ID\": \"1818030307688108\",\n" +
                "                        \"END_DATE\": \"2029-12-31 23:59:59\",\n" +
                "                        \"START_DATE\": \"2020-04-01 00:00:00\",\n" +
                "                        \"UPDATE_TIME\": \"2021-11-15 13:36:01\",\n" +
                "                        \"PRODUCT_ID\": \"89128069\",\n" +
                "                        \"PROVINCE_CODE\": \"18\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"PRIMARY_USER_ID\": \"-1\",\n" +
                "                        \"PRODUCT_MODE\": \"00\",\n" +
                "                        \"BRAND_CODE\": \"4G00\",\n" +
                "                        \"PROD_ITEM_ID\": \"1820022990843756\",\n" +
                "                        \"EPARCHY_CODE\": \"0311\",\n" +
                "                        \"USER_ID\": \"1818030307688108\",\n" +
                "                        \"END_DATE\": \"2029-12-31 23:59:59\",\n" +
                "                        \"START_DATE\": \"2020-03-01 00:00:00\",\n" +
                "                        \"UPDATE_TIME\": \"2021-11-15 13:36:01\",\n" +
                "                        \"PRODUCT_ID\": \"90410727\",\n" +
                "                        \"PROVINCE_CODE\": \"18\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"USER\": [\n" +
                "                    {\n" +
                "                        \"ACCT_TAG\": \"0\",\n" +
                "                        \"DEVELOP_DEPART_ID\": \"18b0j6x\",\n" +
                "                        \"CUST_ID\": \"1816111185986077\",\n" +
                "                        \"SERVICE_STATE_CODE\": \"0\",\n" +
                "                        \"EPARCHY_CODE\": \"0311\",\n" +
                "                        \"REMOVE_TAG\": \"0\",\n" +
                "                        \"MPUTE_DATE\": \"2020-10-21 15:49:50\",\n" +
                "                        \"USER_ID\": \"1818030307688108\",\n" +
                "                        \"USECUST_ID\": \"1816111185986077\",\n" +
                "                        \"OPEN_DEPART_ID\": \"18b0j6x\",\n" +
                "                        \"REMOVE_REASON_CODE\": \"\",\n" +
                "                        \"CREDIT_RULE_ID\": \"-1\",\n" +
                "                        \"DESTROY_DATE\": \"\",\n" +
                "                        \"PROVINCE_CODE\": \"18\",\n" +
                "                        \"CHANGEUSER_DATE\": \"\",\n" +
                "                        \"SERIAL_NUMBER\": \"13111520115\",\n" +
                "                        \"IN_DEPART_ID\": \"18b0j6x\",\n" +
                "                        \"IN_DATE\": \"2018-03-03 11:40:30\",\n" +
                "                        \"FIRST_CALL_DATE\": \"\",\n" +
                "                        \"BRAND_CODE\": \"4G00\",\n" +
                "                        \"USER_DIFF_CODE\": \"00\",\n" +
                "                        \"USER_TYPE_CODE\": \"0\",\n" +
                "                        \"DEVELOP_NO\": \"\",\n" +
                "                        \"LAST_STOP_DATE\": \"2018-05-22 18:54:34\",\n" +
                "                        \"REMARK\": \"新开20元日租卡  首月全月套餐  首次预存话费不退不转\",\n" +
                "                        \"OPEN_STAFF_ID\": \"he-fuxy\",\n" +
                "                        \"REMOVE_EPARCHY_CODE\": \"\",\n" +
                "                        \"PREPAY_TAG\": \"1\",\n" +
                "                        \"CITY_CODE\": \"18a05u\",\n" +
                "                        \"IN_NET_MODE\": \"0\",\n" +
                "                        \"IN_STAFF_ID\": \"he-fuxy\",\n" +
                "                        \"CONTRACT_ID\": \"\",\n" +
                "                        \"UPDATE_TIME\": \"2020-05-28 14:59:56\",\n" +
                "                        \"PRODUCT_ID\": \"90410727\",\n" +
                "                        \"PRE_DESTROY_DATE\": \"\",\n" +
                "                        \"DEVELOP_EPARCHY_CODE\": \"0311\",\n" +
                "                        \"REMOVE_DEPART_ID\": \"\",\n" +
                "                        \"NET_TYPE_CODE\": \"50\",\n" +
                "                        \"BASE_CREDIT_VALUE\": \"3500\",\n" +
                "                        \"USER_GROUP_TYPE\": \"\",\n" +
                "                        \"CREDIT_CLASS\": \"67\",\n" +
                "                        \"CREDIT_VALUE\": \"3500\",\n" +
                "                        \"OPEN_MODE\": \"0\",\n" +
                "                        \"MPUTE_MONTH_FEE\": \"1\",\n" +
                "                        \"OPEN_DATE\": \"2018-03-03 11:40:27\",\n" +
                "                        \"REMOVE_CITY_CODE\": \"\",\n" +
                "                        \"DEVELOP_CITY_CODE\": \"18a05u\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"SUB_DESC\": \"执行成功!\",\n" +
                "        \"RSP_CODE\": \"0000\"\n" +
                "    }";

        JSONObject obj = JSONObject.parseObject(data);
        JSONArray data1 = obj.getJSONArray("DATA");
        System.out.println(data1.size());
        JSONObject jsonObject = data1.getJSONObject(0);
//        JSONArray user_product = jsonObject.getJSONArray("USER_PRODUCT");
//        System.out.println(user_product.size());
        JSONArray user = jsonObject.getJSONArray("USER");
        System.out.println(user.size());

        for (int i = 0; i < user.size(); i++){
            System.out.println(user.getJSONObject(i).get("PRODUCT_ID"));
        }
    }

}
