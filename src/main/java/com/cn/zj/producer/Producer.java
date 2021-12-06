package com.cn.zj.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2021/12/6
 */
@Component
public class Producer {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    //发送消息方法
    public void send() {
        kafkaTemplate.send("wdk", "这是一条测试消息");
    }
}
