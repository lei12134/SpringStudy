package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lei
 * @date 2024/3/18$
 */
@Controller
@RequestMapping("annotationStudy")
public class AnnotationStudy {

    /*@RequestBody: 用于获取请求体内容
        required: 是否必须有请求体; true(default): get 请求方式会报错; false: get 请求得到 null
     */
    @RequestMapping("/requestbody")
    public String useRequestBody(@RequestBody(required=false) String body){
        System.out.println(body);
        return "success";
    }

   /*@PathVariable: 用于绑定 url 中的占位符
        value: 用于指定 url 中占位符名称;
		required: 是否必须提供占位符;
    */
    @RequestMapping("/pathVariable/{id}")
    public String usePathVariable(@PathVariable(value = "id", required = false) Integer id){
        System.out.println(id);
        return "success";
    }

    /*@RequestHeader: 用于获取请求消息头
        value: 提供消息头名称;
        required: 是否必须有此消息头;
     */
    @RequestMapping("/requestHeader")
    public String useRequestHeader(@RequestHeader(value="Accept-Language",required=false)String requestHeader){
        System.out.println(requestHeader);
        return "success";
    }

    /*@CookieValue: 把指定cookie名称的值传入控制器方法参数
        value: 指定cookie的名称;
        required: 是否必须有此cookie;
     */
    @RequestMapping("/cookieValue")
    public String useCookieValue(@CookieValue(value="JSESSIONID",required=false)String cookieValue){
        System.out.println(cookieValue);
        return "success";
    }


//    @ModelAttribute
//    public void showModel(User user) {
//        System.out.println("执行了 showModel 方法"+user.getUsername());
//    }
//    @RequestMapping("/modelAttribute")
//    public String testModelAttribute(User user) {
//        System.out.println("执行了控制器的方法"+user.getUsername());
//        return "success";
//    }




}
