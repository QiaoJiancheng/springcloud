package com.atguigu.springcloud.service;

/**
 * @author QiaoJiancheng
 * @create 2023/2/13 16:30
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
