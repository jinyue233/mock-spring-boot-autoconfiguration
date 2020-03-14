package com.ymbj.activemq;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ActiveMqProperties.class)
@ConditionalOnClass(ActiveMq.class)
@ConditionalOnProperty(prefix = "activemq", value = {"name", "port"}, matchIfMissing = false)
public class ActiveMqAutoConfiguration {

    @Bean
    public ActiveMqService rocketMqService(ActiveMqProperties activeMqProperties) {
        return new ActiveMqService(activeMqProperties.getName(), activeMqProperties.getPort());
    }
}
