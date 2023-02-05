package com.atguigu.springcloud;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.TimeZone;

/**
 * @author QiaoJiancheng
 * @create 2023/2/5 16:49
 */
public class test {
    @Test
    public void test1() {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
