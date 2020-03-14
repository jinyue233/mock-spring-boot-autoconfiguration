package com.ymbj.activemq;


public class ActiveMqService {

    private String name;

    private String port;

    public ActiveMqService(String name, String port) {
        this.name = name;
        this.port = port;
    }

    public String sayHelloWorld() {
        /*// TODO:这里没有进行用spring注册bean的方式的话，当触发该方法new ActiveMqLogSupport对象时，也会触发ClassNotFoundException，原因就是引入ActiveMqLogSupport对象所在库时是optional？？？
        new ActiveMqLogSupport().log("Hello, My name is " + name + ", my service port is " + port);*/
        return "Hello, My name is " + name + ", my service port is " + port;
    }
}
