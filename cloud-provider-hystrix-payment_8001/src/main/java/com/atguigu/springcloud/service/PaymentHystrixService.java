package com.atguigu.springcloud.service;

/**
 * @author QiaoJiancheng
 * @create 2023/2/4 22:53
 */
public interface PaymentHystrixService {

    public String paymentHystrix_ok(Integer id);

    public String paymentHystrix_timeOut(Integer id);

    public String paymentCircuitBreaker(Integer id);
}
