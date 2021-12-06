package com.cn.zj.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2021/12/6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTest {
    @Autowired
    Producer producer;
    @Test
    public void testSend(){
        producer.send();
    }
}
