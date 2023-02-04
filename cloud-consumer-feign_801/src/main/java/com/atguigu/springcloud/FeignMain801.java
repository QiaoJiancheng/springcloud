package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author QiaoJiancheng
 * @Create 2023/2/4 21:37
 */
@EnableFeignClients
@SpringBootApplication
public class FeignMain801 {
    public static void main(String[] args) {
        SpringApplication.run(FeignMain801.class, args);
    }
}
