package com.example.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * @author lei
 * @date 2024/3/16$
 */
public class MyAroundMethod implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前增强");
        //执行目标对象的方法
        Object result = methodInvocation.proceed();
        System.out.println("环绕后增强");
        System.out.println("--------------");
        return result;
    }
}
