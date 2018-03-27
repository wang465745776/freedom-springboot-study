package com.wanggt.freedom.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudyApplication {

    @RequestMapping("/helloWorld")
    private String helloWorld() {
        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

}
