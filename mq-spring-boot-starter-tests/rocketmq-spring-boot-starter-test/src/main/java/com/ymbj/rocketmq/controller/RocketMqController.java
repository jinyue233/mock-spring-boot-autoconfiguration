package com.ymbj.rocketmq.controller;


import com.ymbj.rocketmq.RocketMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rocketmq")
public class RocketMqController {

    @Autowired
    private RocketMqService rocketMqService;

    @ResponseBody
    @GetMapping("/helloworld")
    public String sayHelloWorld() {
        return rocketMqService.sayHelloWorld();
    }
}