package com.xxl.job.executor.service.jobhandler.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.internals.Topic;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class Producer {

    private static final String topic = "JavaKafka";

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        KafkaProducer kafkaProducer = new KafkaProducer<>(properties);

        try {
            while (true) {
                String message = "Java - Hi,Kafka";
                ProducerRecord<String, String> record = new ProducerRecord<>(topic, message);
                kafkaProducer.send(record);
                System.out.println("kafka生产者发送消息: " + message);
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            kafkaProducer.close();
        }


    }

}
