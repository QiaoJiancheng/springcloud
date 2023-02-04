package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiaoJiancheng
 * @create 2023/2/4 23:00
 */
@RestController
public class PaymentHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentHystrix_ok(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentHystrix_ok(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentHystrix_timeOut(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentHystrix_timeOut(id);
    }
}
