package com.qf.web_classes;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@DubboComponentScan("com.qf.web_classes.serviceimpl")

public class WebClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClassesApplication.class, args);
    }

}
