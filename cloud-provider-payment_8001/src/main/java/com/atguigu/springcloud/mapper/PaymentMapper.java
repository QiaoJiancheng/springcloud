package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    public int save(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
