package com.ymbj.activemq.controller;

import com.ymbj.activemq.ActiveMq;
import com.ymbj.activemq.ActiveMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/activemq")
public class ActiveMqController {

    @Autowired
    private ActiveMqService activeMqService;

    @ResponseBody
    @GetMapping("/helloworld")
    public String sayHelloWorld() {
        ActiveMq a = new ActiveMq();
        return activeMqService.sayHelloWorld();
    }
}
