package com.ymbj.activemq;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "activemq")
public class ActiveMqProperties {

    private String name;

    private String port;

    public void setName(String name) {
        this.name = name;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public String getPort() {
        return port;
    }

}
