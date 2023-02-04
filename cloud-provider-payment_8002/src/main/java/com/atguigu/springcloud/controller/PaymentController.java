package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public CommonResult save(@RequestBody Payment payment) {
        int result = paymentService.save(payment);
        log.info("保存数据Payment成功，{}", result);
        if (result > 0) {
            return new CommonResult(200, "****** 保存成功 ******" + serverPort, result);
        }else {
            return new CommonResult(444, "****** 保存失败 ******", null);
        }
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询成功，{}", payment);
        if (payment != null) {
            return new CommonResult(200, "****** 查询成功 ******" + serverPort, payment);
        }else {
            return new CommonResult(444, "****** 查询失败 ******", null);
        }
    }
}
