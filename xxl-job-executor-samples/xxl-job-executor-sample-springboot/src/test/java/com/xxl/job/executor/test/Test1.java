package com.xxl.job.executor.test;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.protocol.types.Field;
import org.junit.Test;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

    @Test
    public void test1(){
        List<String> strs = Arrays.asList("aaa", "bbb", "ccc");
        ListIterator<String> listIterator = strs.listIterator();
        while (listIterator.hasNext()){
            int nextIndex = listIterator.nextIndex();
            System.out.println(nextIndex);
            String next = listIterator.next();
            System.out.println(next);
        }
    }

    @Test
    public void test2(){
        List<String> strs = Arrays.asList("aaa", "bbb", "ccc");
        Iterator<String> iterator = strs.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }

    @Test
    public void test3(){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"haha"));
        list.add(new User(1,"嘿嘿"));
        list.add(new User(1,"呵呵"));
        ListIterator<User> userListIterator = list.listIterator();
        while (userListIterator.hasNext()){
            User next = userListIterator.next();
            System.out.println(userListIterator.nextIndex());
            if (userListIterator.nextIndex() == 1){
                next.setName("haha更新了");
            }
        }
        System.out.println(list.get(0).getName());
    }

    @Test
    public void test4(){
        new TicketThread("线程1").start();
        new TicketThread("线程2").start();
        new TicketThread("线程3").start();
    }

    @Test
    public void testExecutor() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new TicketThread());
        executorService.execute(new TicketThread());
        executorService.execute(new TicketThread());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
    }

    @Test
    public void testExecutor2() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int maxcount = 20;
        while (true){
            if (maxcount <= 0){
                break;
            }
            maxcount --;
//            executorService.execute(new TicketThread());
            executorService.execute(new TestThread());
            System.out.println("主线程:"+Thread.currentThread().getName());
            Thread.sleep(2000);
        }

    }

    @Test
    public void test5(){
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        List<RedisClientInfo> clientList = redisTemplate.getClientList();
        System.out.println(clientList);

    }


    public boolean flag;

    @Test
    public void test6(){

        System.out.println(flag);
    }

    @Test
    public void test7(){
//        byte[] a = {0x01};
//        String s = new String(a);
        String s = new String(new byte[]{0x01});
        System.out.println(s);
        String bb = "aa"+s+"aa";
        System.out.println(bb);
        String[] s1 = bb.split(" ");
        byte[] b = {0x0a};
        String s2 = new String(b);
        System.out.println(s1.length+s2+"hhhh");

    }

    @Test
    public void test8(){
        String path = "/aa/bbb";
        String[] split = path.split("/");
        System.out.println(split.length);
        System.out.println(split[0].equals(""));
        for (String str : split){
            if (!str.equals("")) {
                System.out.println(str);
            }
        }
    }

    @Test
    public void test9(){
        Object str  = null ;


        List<Integer> list = JSONObject.parseArray("[1,2]", Integer.class);
        System.out.println(list);

//        System.out.println(str.toString());
//        if (str == null || str.toString() == null)   {
//            System.out.println(".....");
//        }


    }

    @Test
    public void test10 (){
        try {
            System.out.println("aaa");
            int num =  1/0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("cccc");
            return;
        }finally {
            System.out.println("dddd");
        }
        System.out.println("bbbb");
    }

    @Test
    public void test11(){
//        String regex = "^[\\d]*$";
        String regex = "^[0-9]*$";
        System.out.println("156565656E+11".matches(regex));
    }

    @Test
    public void test12(){
//        List test = null;
        List<Integer> list = new ArrayList<>();
        System.out.println("分支合并冲突测试");
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) o1 - (int)o2;
            }
        });

    }

    @Test
    public void test13(){
        System.out.println("分支合并冲突测试");
    }

    @Test
    public void test14(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date data = null;
        String format = sdf.format(data);
    }

    @Test
    public void test15(){
        String data = "";
        Map<String,Object> map = JSONObject.parseObject(data, Map.class);

        System.out.println(map);
    }



    @Test
    public void test16() throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        int maxcount = 10;
        while (true){
            maxcount--;
            if (maxcount <= 0){break;}
            System.out.println(maxcount+":"+ Thread.currentThread().getName());
            executorService.execute(new testThread());
            Thread.sleep(3000);
        }
        executorService.shutdown();
    }

    class testThread extends Thread{
        @Override
        public void run() {
            System.out.println(currentThread().getName());
            TestNum.test1();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test19(){
//        HashMap<String, Object> demo = new HashMap<>();
//        demo.put("num","是");
//        Object num = 1;
//        System.out.println("1".equals(demo.get("num").toString()));

        Integer num = null;
        System.out.println(num == 0);
    }

    @Test
    public void test20()  {

//        String demo  =  "aaaaaaaaaa";
//        byte[] bytes = demo.getBytes();
//        System.out.println(bytes);

        try {
            int count = 10;
            if (count == 10){
                throw new RuntimeException("异常");
            }
            System.out.println("1111111111");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("222222222");
        }

    }

    @Test
    public void test21(){

        int count  =  0;
        while (true){
            count++;
            if (count > 5){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("2222222222");
                continue;
            }
            System.out.println(count);
        }

    }



    @Test
    public void test22(){

//        String rspDesc = "[组合优惠开单接口响应描述]:产品变更提交服务预提交返回:sUniTrade接口返回:[INDETERMINATE]Utility.cpp:207,12CRMException-300263: TCS_ChangeServiceReg执行异常: [INDETERMINATE]TradeCheckTradeSuperLimit.cpp:1791,12CRMException-300263: 特殊限制判断: $$$20161$$$用户的主产品应满足套餐条件才可办理【5G升级包29元10G（立即生效）】!!!;TRANSIDO为:1872010314030207777..";
//          String rspDesc = "[组合优惠开单接口响应描述]:checkUserInfo接口返回:[INDETERMINATE]CheckAllInfoNodeParser.cpp:8427,12CRMException-300297: TradeCheck_SvcstateTradeLimit:$$$00001$$$用户具有不能办理该业务的服务状态[语音主服务.高额半停机]！;TRANSIDO为:1872010311295182820.";
//       String rspDesc = "[组合优惠开单接口响应描述]:产品变更提交服务预提交返回:sUniTrade接口返回:[INDETERMINATE]Utility.cpp:207,12CRMException-300041: TCS_ChangeServiceReg执行异常: [WARNING]TradeCheckAfterTrade.cpp:3553,12CRMException-300041: $$$00105$$$业务登记后条件判断:退出产品校验TAG校验异常！ Caused by: [WARNING]TradeCheckAfterTrade.cpp:10215,12CRMException-300041: $$$20054$$$重复选择，业务无法继续！\"5G升级包29元10G（立即生效） -- 5G升级包29元10G -- 5G升级包29元10G（立即生效）（流量使用优先于套内）\"、\"5G升级包29元10G（立即生效） -- 5G升级包29元10G -- 5G升级包29元10G（立即生效）（流量使用优先于套内）\"，\"5G升级包29元10G（立即生效） -- 5G升级包29元10G -- 5G升级包优惠购权益\"、\"5G升级包29元10G（立即生效） -- 5G升级包29元10G -- 5G升级包优惠购权益\"，\"优惠购益选包（5G升级专享合约版） -- 优惠购益选包（5G升级专享合约版） -- 优惠购益选包（5G升级专享合约版）\"、\"优惠购益选包（5G升级专享合约版） -- 优惠购益选包（5G升级专享合约版） -- 优惠购益选包（5G升级专享合约版）\"，\"5G升级包29元10G（立即生效） -- 沃云盘10G云存服务叠加包（免费） -- 沃云盘10G云存服务（免费）\"、\"5G升级包29元10G（立即生效） -- 沃云盘10G云存服务叠加包（免费） -- 沃云盘10G云存服务（免费）\"，\"5G升级包29元10G（立即生效） -- 5G优享服务 -- 5G上网服务(下行峰值500Mbps)\"、\"5G升级包29元10G（立即生效） -- 5G优享服务 -- 5G上网服务(下行峰值500Mbps)\";TRANSIDO为:1872010314453633104.";
//          String rspDesc = "checkUserInfo接口返回:[WARNING]CheckAllInfoNodeParser.cpp:11811,12CRMException-8888: $$$20050$$$根据用户号码获取用户资料无数据!;TRANSIDO为:1872010609375526340.";

        String rspDesc = "[组合优惠开单接口响应描述]:checkUserInfo接口返回:[WARNING]CheckAllInfoNodeParser.cpp:10381,12CRMException-300041: 查询用户未完工的限制业务的订单号出错！$$$00003$$$ Caused by: [INDETERMINATE]CheckAllInfoNodeParser.cpp:10371,12CRMException-8888: $$$00003$$$用户[18617663562]办理[产品/服务变更120]业务与未完工订单的[集团成员增加1025]业务冲突!订单号：[1822010517077862];TRANSIDO为:1872010617524523833.";
        String str2 = "产品变更提交服务预提交返回:sUniTrade接口返回:[INDETERMINATE]Utility.cpp:207,12CRMException-300041: TCS_ChangeServiceReg执行异常: [WARNING]TradeCheckAfterTrade.cpp:3554,12CRMException-300041: $$$00105$$$业务登记后条件判断:退出产品校验TAG校验异常！ Caused by: [WARNING]TradeCheckAfterTrade.cpp:7333,12CRMException-300041: $$$10010$$$产品：\\\"承诺低消23元送国内流量畅爽用（长期有效）（河北）\\\"，必选业务包：\\\"限速服务包\\\"没有选择，业务无法继续，请选择后再继续办理业务！;TRANSIDO为:1872020741610512752497.";
//        int cpp = str.indexOf("cpp:");
//        String substring = str.substring(cpp+4, cpp + 4 + 5);
//        String[] strs = substring.split(",");
//        String cpp1 = strs[0];
//
//        System.out.println(cpp);
//        System.out.println(substring);
//        System.out.println(cpp1);
//
//        String substring1 = str.substring(cpp + 4 + 5);
//        int cpp2Index = substring1.indexOf("cpp:");
//        System.out.println(cpp2Index);
//        String cpp2 = substring1.substring(cpp2Index + 4, cpp2Index + 4 + 4);
//        System.out.println(cpp2);
//
//        System.out.println(substring1);
//
//
        int cpp1Index = rspDesc.indexOf("cpp:");
        String cpp1Str = rspDesc.substring(cpp1Index+4, cpp1Index + 4 + 5);
        String[] strs = cpp1Str.split(",");
        String cpp1 = strs.length > 0 ? strs[0] : "";    //第一个cpp


        String subRspDesc = rspDesc.substring(cpp1Index + 4 + 5);
        int cpp2Index = subRspDesc.indexOf("cpp:");
        String cpp2 = subRspDesc.substring(cpp2Index + 4, cpp2Index + 4 + 4);   //第2个cpp

        if (cpp1.equals("8427")){
            //高额半停机：取第一个cpp:8427
            System.out.println("高额半停机");
        }else if (cpp1.equals("207") && cpp2.equals("3553")){
            //业务互斥：cpp:207+cpp：3553
            System.out.println("业务互斥");
        }else if(cpp1.equals("207") && cpp2.equals("1791")){
            //业务互斥-套餐不支持:cpp:207+cpp：1791
            System.out.println("业务互斥-套餐不支持");
        }else if (cpp1.equals("10381")){
            //有未完工订单:取第一个cpp:10381
            System.out.println("有未完工订单");
        }else if (cpp1.equals("11811")){
            //用户状态不正常:取第一个cpp:11811
            System.out.println("用户状态不正常");
        }else {
            System.out.println("其他");
        }



//
//
//        System.out.println("checkUserInfo接口返回:[INDETERMINATE]CheckAllInfoNodeParser.".length());
//
//        boolean contains = str2.contains("cpp:207") && str2.contains("cpp:3553");
//        boolean contains1 = str.contains("cpp:207");
//        System.out.println(contains);


    }

    @Test
    public void test23(){
        Object num =  1;
        Object num2 = 1;
        System.out.println(num == num2);

        HashMap<String, Object> map = new HashMap<>();
        map.put("num",1);
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("num" ,1);
        System.out.println(map.get("num")  == map1.get("num"));


        System.out.println(1);
    }


    @Test
    public void test24(){
        List<Integer>  arr = new ArrayList<>();
        arr.add(1);
        System.out.println(arr.subList(1,1));
    }

    public void test00(){
        System.out.println("stash测试");
    }

    public void test111(){
        System.out.println("测试");
    }

}
