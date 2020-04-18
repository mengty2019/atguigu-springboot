package com.atguigu;

import com.atguigu.controller.HelloController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes={HelloWorldMainApplication.class})//指定启动类
public class HelloWorldMainApplicationTest {
    @Resource
    public HelloController helloController;
    @Test
    public void test1(){
        log.info("{}",helloController.hello());
    }
}
