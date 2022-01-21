package com.xxl.job.executor.service.jobhandler;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import redis.clients.jedis.commands.JedisCommands;

import java.util.List;

public class TestRedis {

    @Autowired
    private static RedisTemplate redisTemplate;

    public static void main(String[] args) {
//        redisTemplate.execute((RedisCallback<String>) connection -> {
//            JedisCommands jedisCommands = (JedisCommands) connection.getNativeConnection();
//            jedisCommands.setnx()
//        })
        List<RedisClientInfo> clientList = redisTemplate.getClientList();
        System.out.println(clientList);
    }
}
