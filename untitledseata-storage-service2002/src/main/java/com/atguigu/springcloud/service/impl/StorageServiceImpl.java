package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.StorageDao;
import com.atguigu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author QiaoJiancheng
 * @create 2023/2/13 16:31
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("storage-service微服务中开始扣减库存");
        storageDao.decrease(productId, count);
        log.info("storage-service微服务中扣减END");
    }
}
