package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.domain.CommonResult;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author QiaoJiancheng
 * @create 2023/2/13 15:00
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private StorageService storageService;
    @Autowired
    private AccountService accountService;

    /**
     * 创建订单
     * @param order
     * @return
     */
    @Override
    public void create(Order order) {

        // 创建订单
        log.info("创建订单");
        orderDao.create(order);

        // 开始扣减库存
        log.info("开始扣减库存");
        CommonResult storageResult = storageService.decrease(order.getProductId(), order.getCount());
        log.info("扣减库存END");

        // 开始扣减账户金额
        log.info("开始扣减账户金额");
        CommonResult accountResult = accountService.decrease(order.getUserId(), order.getMoney());
        log.info("扣减账户END");

        // 更新订单状态
        log.info("更新订单状态");
        orderDao.updateOrder(order.getUserId(), 0);
    }
}
