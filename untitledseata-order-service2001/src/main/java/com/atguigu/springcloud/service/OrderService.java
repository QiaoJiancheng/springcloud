package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * @author QiaoJiancheng
 * @create 2023/2/13 14:58
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
