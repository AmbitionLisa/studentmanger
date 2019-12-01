package com.qf.web_classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class WebClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClassesApplication.class, args);
    }

}
