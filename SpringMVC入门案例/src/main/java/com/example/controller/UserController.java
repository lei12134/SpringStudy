package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lei
 * @date 2024/3/18$
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        System.out.println("add a user");
        return "success";
    }

    @RequestMapping(value = ("/delete"), params = {"id>0", "name"})
    public String delete(){
        System.out.println("delete a user");
        return "success";
    }
}
