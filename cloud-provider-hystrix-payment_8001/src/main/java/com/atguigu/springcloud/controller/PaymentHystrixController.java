package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiaoJiancheng
 * @create 2023/2/4 23:00
 */
@RestController
@RequestMapping("/payment/hystrix")
public class PaymentHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/ok/{id}")
    public String paymentHystrix_ok(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentHystrix_ok(id);
    }
    @GetMapping("/timeout/{id}")
    public String paymentHystrix_timeOut(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentHystrix_timeOut(id);
    }

    @GetMapping("/circuitbreaker/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentCircuitBreaker(id);
    }
}
