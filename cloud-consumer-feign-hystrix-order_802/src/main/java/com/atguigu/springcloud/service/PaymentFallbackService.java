package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author QiaoJiancheng
 * @create 2023/2/5 11:56
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentHystrix_ok(Integer id) {
        return "---PaymentFallbackService---paymentHystrix_ok";
    }

    @Override
    public String paymentHystrix_timeOut(Integer id) {
        return "---PaymentFallbackService---paymentHystrix_timeOut";
    }
}
