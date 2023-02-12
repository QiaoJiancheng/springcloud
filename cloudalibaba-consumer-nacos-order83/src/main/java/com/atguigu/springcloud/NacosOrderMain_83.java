package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author QiaoJiancheng
 * @create 2023/2/7 17:48
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosOrderMain_83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain_83.class, args);
    }
}
