package com.dist.xdata.sbds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot 应用启动类
 *
 * Created by weifj on 20180924.
 */
// Spring Boot 应用的标识
@SpringBootApplication
@ComponentScan(basePackages = {"com.dist.xdata.sbds.*"})
public class ClientApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ClientApplication.class, args);
    }
}
