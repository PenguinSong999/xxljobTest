package com.xxl.job.executor.test;

import com.xxl.job.executor.XxlJobExecutorApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {XxlJobExecutorApplication.class})
public class TestRedis {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){
//        List clientList = redisTemplate.getClientList();
        redisTemplate.opsForValue().set("test","hahhah");
        String test = (String) redisTemplate.opsForValue().get("test");
        System.out.println(test);
    }
}
