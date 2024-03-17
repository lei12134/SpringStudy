package com.example.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author lei
 * @date 2024/3/16$
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    /**
     * @param method 执行的方法
     * @param objects 参数
     * @param o 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强(执行目标对象的方法前)....");
    }
}
