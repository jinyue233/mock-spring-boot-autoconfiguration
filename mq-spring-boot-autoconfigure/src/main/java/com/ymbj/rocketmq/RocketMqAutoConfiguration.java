package com.ymbj.rocketmq;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RocketMqProperties.class)
@ConditionalOnClass(RocketMq.class)
@ConditionalOnProperty(prefix = "rocketmq", value = {"name", "port"}, matchIfMissing = false)
public class RocketMqAutoConfiguration {

    @Bean
    public RocketMqService rocketMqService(RocketMqProperties rocketMqProperties) {
        return new RocketMqService(rocketMqProperties.getName(), rocketMqProperties.getPort());
    }
}
