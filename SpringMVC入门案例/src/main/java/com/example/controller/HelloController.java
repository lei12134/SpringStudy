package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lei
 * @date 2024/3/18$
 */
@Controller("helloController")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("HelloController中的sayHello方法执行了");
        return "success";
    }
    @GetMapping("/hello1")
    public String sayHello1(){
        System.out.println("HelloController中的sayHello方法执行了");
        return "user";
    }
}
