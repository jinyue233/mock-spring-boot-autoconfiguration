package com.ymbj.activemq;

import com.ymbj.activemq.log.ActiveMqLogSupport;
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

    /*TODO:1,注意这里不能直接注入进来，因为mq-spring-boot-autoconfigure的pom.xml导入的<artifactId>activemq-other-dependency</artifactId>的optional为true，
    而activemq-spring-boot-starter的pom.xml没有显式导入<artifactId>activemq-other-dependency</artifactId>，最终具体项目导入activemq-spring-boot-starter后，
    是不存在<artifactId>activemq-other-dependency</artifactId>依赖的，而ActiveMqLogSupport就在<artifactId>activemq-other-dependency</artifactId>依赖里
    因此具体项目在classpath是扫描不到ActiveMqLogSupport这个类的;
    TODO:2,为什么spring-boot-actuator-autoconfigure的pom.xml有20多个可选依赖，但是spring-boot-starter-actuator的pom.xml只显示导入了<artifactId>micrometer-core</artifactId>这个依赖呢？？？
    @Bean
    public ActiveMqLogSupport activeMqLogSupport() {
        return new ActiveMqLogSupport();
    }*/

}
