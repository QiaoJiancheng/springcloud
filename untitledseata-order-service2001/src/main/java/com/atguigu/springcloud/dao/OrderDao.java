package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author QiaoJiancheng
 * @create 2023/2/12 21:59
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单状态
     */
    void updateOrder(@Param("userId") Long userId, @Param("status") Integer status);
}
