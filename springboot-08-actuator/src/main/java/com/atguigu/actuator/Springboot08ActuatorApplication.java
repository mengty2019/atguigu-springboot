package com.atguigu.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 自定义健康状态监视器
* 1、编写一个指示器实现HealthIndicator接口
* 2、指示器的名字 xxxHealthIndicator
* 3、加入容器中
* */
@SpringBootApplication
public class Springboot08ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot08ActuatorApplication.class, args);
    }
}
