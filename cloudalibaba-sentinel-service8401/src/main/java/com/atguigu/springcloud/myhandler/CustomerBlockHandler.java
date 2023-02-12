package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author QiaoJiancheng
 * @create 2023/2/8 18:58
 */
public class CustomerBlockHandler {

    public static CommonResult blockhandler1(BlockException exception) {
        return new CommonResult(444, "blockhandler1");
    }

    public static CommonResult blockhandler2(BlockException exception) {
        return new CommonResult(444, "blockhandler2");
    }
}
