package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.MessageProvider;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiaoJiancheng
 * @create 2023/2/6 17:49
 */
@RestController
public class SendMessageController {

    @Autowired
    private MessageProvider messageProvider;

    @RequestMapping("/sendmessage")
    public String send() {
        return messageProvider.send();
    }
}
