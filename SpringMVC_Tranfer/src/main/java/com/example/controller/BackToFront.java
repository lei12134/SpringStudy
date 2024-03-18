package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lei
 * @date 2024/3/18$
 */
@Controller
@RequestMapping("backToFront")
public class BackToFront {

    @RequestMapping("/testReturnString")
    public String testReturnString() {
        System.out.println("AccountController 的 testReturnString 方法执行了。。。。");
        return "success";
    }


    @RequestMapping("/testReturnModelAndView")
    public ModelAndView testReturnModelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", "张三");
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/testReturnVoid")
    public void testReturnVoid(HttpServletRequest request,HttpServletResponse response)throws Exception {
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
//        response.sendRedirect("testRetrunString")

    }

    @RequestMapping("/testForward")
    public String testForward() {
        System.out.println("AccountController 的 testForward 方法执行了。。。。");
        return "forward:/WEB-INF/pages/success.jsp";
    }

    // 如果是重定向到 jsp 页面，则 jsp 页面不能写在 WEB-INF 目录中，否则无法找到;
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("AccountController 的 testRedirect 方法执行了。。。。");
        return "redirect:testReturnModelAndView";
    }

}
