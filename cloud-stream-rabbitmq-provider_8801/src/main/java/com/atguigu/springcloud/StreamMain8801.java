package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author QiaoJiancheng
 * @create 2023/2/6 17:12
 */
@EnableEurekaClient
@SpringBootApplication
public class StreamMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMain8801.class, args);
    }
}
