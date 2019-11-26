package com.mallo.index.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: 拓尔思信息技术股份有限公司
 * @Since: wcg
 * @Time: 2019-07-16 20:26
 **/
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    
    public void send(){
        String msg = "hello: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        amqpTemplate.convertAndSend("hello", msg);
    }
}
