package com.ymbj.rocketmq;

public class RocketMqService {
    private String name;

    private String port;

    public RocketMqService(String name, String port) {
        this.name = name;
        this.port = port;
    }

    public String sayHelloWorld() {
        return "Hello, My name is " + name + ", my service port is " + port;
    }
}
