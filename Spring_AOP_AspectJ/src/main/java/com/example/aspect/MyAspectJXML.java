package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author lei
 * @date 2024/3/17$
 */
public class MyAspectJXML {
    /**
     * 前置通知
     * @param joinPoint
     */
    public void before(JoinPoint joinPoint){
        //打印的是切点信息
        System.out.println(joinPoint);
        System.out.println("前置增强");
    }

    /**
     * 后置通知
     * @param returnValue
     */
    public void after(Object returnValue){
        System.out.println("后置通知");
        System.out.println("方法的返回值为:"+returnValue);
    }

    /**
     * 环绕通知增强
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    public Object arount(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知增强-----前");
        // 执行目标方法
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕通知增强-----后");
        return obj;
    }

    /**
     * 异常通知增强
     * @param e
     */
    public void afterThrowing(Throwable e){
        System.out.println("出现异常"+e.getMessage());
    }

    /**
     * 最终通知增强
     */
    public void after1(){
        System.out.println("最终通知");
    }
}
