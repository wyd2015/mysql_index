package com.mallo.index.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @Author: 拓尔思信息技术股份有限公司
 * @Since: wcg
 * @Time: 2019-07-16 20:29
 **/
@Slf4j
@RabbitListener //定义该类对指定队列的监听
public class Consumer {
    
    @RabbitHandler  //指定对消息的处理方法
    public void consume(String msg){
      log.info("接收到消息："+msg);
    }
    
}
