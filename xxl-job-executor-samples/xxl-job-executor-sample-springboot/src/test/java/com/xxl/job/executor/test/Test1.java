package com.xxl.job.executor.test;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.protocol.types.Field;
import org.junit.Test;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;

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
        System.out.println("分支合并冲突测试");
        ArrayList<Integer> list = new ArrayList<>();
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

}
