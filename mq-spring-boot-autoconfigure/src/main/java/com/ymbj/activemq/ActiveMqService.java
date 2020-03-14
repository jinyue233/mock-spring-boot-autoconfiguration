package com.ymbj.activemq;

public class ActiveMqService {
    private String name;

    private String port;

    public ActiveMqService(String name, String port) {
        this.name = name;
        this.port = port;
    }

    public String sayHelloWorld() {
        return "Hello, My name is " + name + ", my service port is " + port;
    }
}
