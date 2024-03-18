package com.example.controller;

import com.example.bean.Account;
import com.example.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author lei
 * @date 2024/3/18$
 */
//  获取从前端传送的数据
@Controller("transfer")
@RequestMapping("/transfer")
public class Transfer {
//    @RequestMapping("/deal1")
//    public String deal1(int val, String name){
//        System.out.println(val);
//        System.out.println(name);
//        return "success";
//    }
    /* @RequestParam
    value: 请求参数中的名称
	required: 参数是否必要; true: 参数不能为空
     */
    @RequestMapping("/deal1")
    public String deal1(@RequestParam(value = "val", required = false) int val, String name){
        System.out.println(val);
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/deal2")
    public String saveAccount(Account account) {
        System.out.println("保存了账户。。。。"+account);
        return "success";
    }

    @RequestMapping("/deal3")
    public String updateAccount(User user) {
        System.out.println("更新了账户。。。。"+user);
        return "success";
    }

//    自定义类型转换器
    @RequestMapping("/deal4")
    public String deleteAccount(Date date) {
        System.out.println("删除了账户。。。。"+date);
        return "success";
    }

}
