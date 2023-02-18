package com.atguigu.springcloud.service;

import java.math.BigDecimal;

/**
 * @author QiaoJiancheng
 * @create 2023/2/13 16:46
 */
public interface AccountService {

    /**
     * 扣减账户余额
     */
    void decrease(Long userId, BigDecimal money);
}
