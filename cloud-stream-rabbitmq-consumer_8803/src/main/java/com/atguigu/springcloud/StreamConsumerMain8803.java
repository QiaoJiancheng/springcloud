package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author QiaoJiancheng
 * @create 2023/2/6 18:53
 */
@EnableEurekaClient
@SpringBootApplication
public class StreamConsumerMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerMain8803.class, args);
    }
}
