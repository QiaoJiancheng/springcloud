package com.atguigu.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author QiaoJiancheng
 * @create 2023/2/4 22:54
 */
@Service
public class PaymentHystrixServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentHystrix_ok(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + ", PaymentHystrix_ok ID: " + id + ", \t" + "(●'◡'●)";
    }

    @HystrixCommand(fallbackMethod = "paymentHystrix_timeOut_fallback", commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    @Override
    public String paymentHystrix_timeOut(Integer id) {
        Integer timeNum = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "线程池：" + Thread.currentThread().getName() + ", PaymentHystrix_Timeout ID: " + id + ", \t" + "(●'◡'●) \t" + "耗时（秒）" + timeNum;
    }

    public String paymentHystrix_timeOut_fallback(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + ", paymentHystrix_timeOut_fallback ID: " + id + ", \t" + "/(ㄒoㄒ)/~~";
    }


    // 服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),                      // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),         // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),   // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")        // 失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id) {
        if (id < 0) {
            throw new RuntimeException("******* id 不能为负数");
        }
        String serialNum = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "调用成功，流水号：" + serialNum;
    }
    public String paymentCircuitBreakerFallback(Integer id) {
        return "paymentCircuitBreakerFallback";
    }
}
