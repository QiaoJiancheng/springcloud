package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.MessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author QiaoJiancheng
 * @create 2023/2/6 17:42
 */
@Slf4j
@EnableBinding(Source.class)
public class MessageProviderServiceImpl implements MessageProvider {

    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("*********serial: {}", serial);
        return null;
    }
}
