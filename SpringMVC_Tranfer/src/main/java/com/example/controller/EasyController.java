package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lei
 * @date 2024/3/18$
 */
@Controller
public class EasyController {

    @RequestMapping("/index1")
    public String goToIndex1(){
        return "frontToback";
    }

    @RequestMapping("/index2")
    public String goToIndex2(){
        return "AnnotationStudy";
    }

    @RequestMapping("/index3")
    public String goToIndex3(){
        return "backTofront";
    }
}
