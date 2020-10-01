package com.example.redissample.service;

import com.example.redissample.domain.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;




@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","repo"})
 public class CustomerService {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(CustomerService.class, args);
    }


    @Bean
    public JedisConnectionFactory  jedisConnectionFactory(){
        System.out.println("jedisConnectionFactory");
        return  new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String,Customer>  redisTemplate(){
        System.out.println("redisTemplate");
        RedisTemplate<String,Customer> customerTemplate = new RedisTemplate<>();
        customerTemplate.setConnectionFactory(jedisConnectionFactory());
        return customerTemplate;
    }

}
