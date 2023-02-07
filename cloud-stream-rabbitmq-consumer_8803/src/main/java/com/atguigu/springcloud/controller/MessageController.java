package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

/**
 * @author QiaoJiancheng
 * @create 2023/2/6 18:54
 */
@Slf4j
@EnableBinding(Sink.class)
@Controller
public class MessageController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void message(Message<String> message) {
        log.info("消费者二号，接收到的消息是：" + message.getPayload() + ", serverPort: " + serverPort);
    }
}
