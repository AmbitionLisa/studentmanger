package com.qf.web_classes;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@DubboComponentScan("com.qf.web_classes.serviceimpl")
@MapperScan("com.qf.web_classes.dao")
public class WebClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClassesApplication.class, args);
    }

}
