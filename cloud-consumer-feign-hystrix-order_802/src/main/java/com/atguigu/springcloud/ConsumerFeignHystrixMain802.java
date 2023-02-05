package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author QiaoJiancheng
 * @create 2023/2/5 10:26
 */
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class ConsumerFeignHystrixMain802 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixMain802.class, args);
    }
}
