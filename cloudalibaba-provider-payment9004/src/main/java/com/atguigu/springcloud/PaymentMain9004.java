package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author QiaoJiancheng
 * @create 2023/2/8 19:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9004.class, args);
    }
}
