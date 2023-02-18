package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author QiaoJiancheng
 * @create 2023/2/13 15:59
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.dao"})
public class MyBatisConfig {
}
