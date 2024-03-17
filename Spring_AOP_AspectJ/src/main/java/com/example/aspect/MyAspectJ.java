package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author lei
 * @date 2024/3/17$
 */
@Component // 注解的方式,spring管理对象的创建
@Aspect  // 用来定义且切面
public class MyAspectJ {
    /**
     * 前置通知
     * 对UserDao里面的以add方法进行增强
     * @param joinPoint
     */
    @Before("execution(* com.example.dao.UserDao.add*(..))")
    public void before(JoinPoint joinPoint){
        //打印的是切点信息
        System.out.println(joinPoint);
        System.out.println("前置增强");
    }

    /**
     * 后置通知
     * 对update开头的方法进行增强
     * @param returnValue
     */
    @AfterReturning(value = "execution(* com.example.dao.UserDao.update*(..))",returning = "returnValue") // 接受返回值,方法的返回值为任意类型
    public void after(Object returnValue){
        System.out.println("后置通知");
        System.out.println("方法的返回值为:"+returnValue);
    }

    /**
     * 环绕通知增强
     * 对以find开头的方法进行增强
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "execution(* com.example.dao.UserDao.find*(..))")
    public Object arount(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知增强-----前");
        // 执行目标方法
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕通知增强-----后");
        return obj;
    }

    /**
     * 异常通知增强
     * 对以find开头的方法进行增强
     * @param e
     */
    @AfterThrowing(value = "execution(* com.example.dao.UserDao.find(..))",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("出现异常"+e.getMessage());
    }

    @After(value = "execution(* com.example.dao.UserDao.find(..))")
    public void after(){
        System.out.println("最终通知");
    }
}
