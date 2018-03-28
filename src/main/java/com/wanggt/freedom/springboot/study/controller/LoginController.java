package com.wanggt.freedom.springboot.study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author freedom wang.
 * @since 1.0.
 */
@RestController
public class LoginController {

    /**
     * 方法Login用于.
     *
     * @return the string
     * @author freedom wang
     * @since 1.0
     */
    @PostMapping("/login")
    public String login(){
        return "";
    }

}
