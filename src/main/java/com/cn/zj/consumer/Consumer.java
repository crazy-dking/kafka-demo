package com.cn.zj.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2021/12/1
 */
@Component
@KafkaListener(id = "${data.group}", topics = "${data.topic}")
public class Consumer {
    @KafkaHandler
    public void listen(Object obj, Acknowledgment acknowledgment) {
        ConsumerRecord record = (ConsumerRecord) obj;
        System.out.println(record.value());
        acknowledgment.acknowledge();
    }
}
