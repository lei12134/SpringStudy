package com.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lei
 * @date 2024/3/17$
 */
class Product{
    public void add(){
        System.out.println("添加商品 ... ");
    }
    public void subtract(){
        System.out.println("减少商品 ... ");
    }
}


public class CglibProxy implements MethodInterceptor {
    private Product product;

    public CglibProxy(Product product) {
        this.product = product;
    }

    public Product createProxy(){
        //1.使用CGLIB生成代理
        Enhancer enhancer = new Enhancer();
        //2.为其设置父类(因为采用继承机制,所以的指定父类)
        enhancer.setSuperclass(product.getClass());
        //3.设置回调:和javaProxyInvoke相似
        enhancer.setCallback(this);
        //4.创建代理
        return (Product) enhancer.create();
    }

    /**
     *
     * @param o CGLIB根据指定父类生成的代理对象(是ProductDao的子类)
     * @param method 拦截的方法
     * @param objects 拦截方法的参数数组
     * @param methodProxy 方法的代理对象,用于执行父类的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("add".equals(method.getName())){
            //在执行 add 方法前执行记录日志
            System.out.println("----记录日志----");
            // 执行add方法
            Object result = methodProxy.invokeSuper(o,objects);
            // 执行add方法后的返回值
            return result;
        }
        // 执行的其他方法
        return methodProxy.invokeSuper(o,objects);
    }

    public static void main(String[] args) {
        // 目标对象
        Product product = new Product();
        // 生成代理对象
        Product proxy = new CglibProxy(product).createProxy();

        proxy.add();

    }
}
