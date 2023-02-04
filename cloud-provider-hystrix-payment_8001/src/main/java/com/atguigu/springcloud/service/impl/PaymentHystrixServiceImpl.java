package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentHystrixService;
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
}
