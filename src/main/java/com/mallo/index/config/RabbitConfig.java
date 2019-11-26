package com.mallo.index.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 拓尔思信息技术股份有限公司
 * @Since: wcg
 * @Time: 2019-07-16 20:35
 **/
@Configuration
public class RabbitConfig {
    
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
    
}
