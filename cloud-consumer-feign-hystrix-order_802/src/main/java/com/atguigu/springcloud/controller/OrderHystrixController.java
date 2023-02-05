package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author QiaoJiancheng
 * @create 2023/2/5 10:28
 */
@Slf4j
@RestController
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentHystrix_ok(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentHystrix_ok(id);
    }

//    @HystrixCommand(fallbackMethod = "paymentHystrix_timeOut_fallback", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentHystrix_timeOut(@PathVariable("id") Integer id) {
//        int i = 10 / 0;
        return paymentHystrixService.paymentHystrix_timeOut(id);
    }

    public String paymentHystrix_timeOut_fallback(@PathVariable("id") Integer id) {
        return "paymentHystrix_timeOut_fallback" + id;
    }

    // 全局熔断处理方法
    public String paymentGlobalFallbackMethod() {
        return "payment global fallback method";
    }
}
