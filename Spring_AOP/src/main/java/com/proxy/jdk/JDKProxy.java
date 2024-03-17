package com.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lei
 * @date 2024/3/17$
 */
interface User{
    public void add();
    public void subtract();
}

class UserImpl implements User{
    int val;

    public int getVal() {
        return val;
    }

    public UserImpl(int val) {
        this.val = val;
    }

    @Override
    public void add() {
        val += 1;
        System.out.println(val);
    }

    @Override
    public void subtract() {
        val -= 1;
        System.out.println(val);
    }
}

public class JDKProxy {
    public User user;

    JDKProxy(User user){
        this.user = user;
    }

    public User createProxy(){
        // 生成 JDK 动态代理对象
        User userProxy = (User) Proxy.newProxyInstance(user.getClass().getClassLoader(), user
                .getClass().getInterfaces(), new InvocationHandler() {
            /**
             * InvocationHandler 生成方式:
             * 1.匿名内部类的形式
             * 2.直接让当前类谁实现 InvocationHandler 接口， 然后创建代理的 InvocationHandler 写 this
             * 3.重写写一个类实现 InvocationHandler 接口， 在本类中通过的 new 的方式创建
             * @param proxy
             * @param method
             * @param args
             * @return
             * @throws Throwable
             */
            //代用目标对象的任何一个方法都相当于代用 invoke
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("add")){
                    System.out.println("ready to add ...");
                    System.out.println("0 + 1 = 1");

                    // 调用被代理对象的方法
                    /**
                     * method.invoke(obj,args): 对带有指定参数的指定对象调用由此 Method
                     * 对象表示的底层方法。
                     * 参数一： obj - 从中调用底层方法的对象
                     * 参数二： args 用于方法调用的参数
                     * 返回值： result:使用参数 args 在 obj 上指派该对象所表示方法的结果
                     */
                    Object object = method.invoke(user, args);
                    return object;
                }else{
                    System.out.println("ready to add ...");
                    System.out.println("subtract ... ");
                    return method.invoke(user, args);
                }
            }
        });
        return userProxy;
    }

    public static void main(String[] args) {
        User user = new UserImpl(0);

        JDKProxy jdkProxy = new JDKProxy(user);
        User userProxy = jdkProxy.createProxy();    // JDK 动态代理对象
        //  经测试可知: JDK 动态代理相当于 动态覆写 了被代理对象的方法，本身不包含数据；

        userProxy.add();

        System.out.println(((UserImpl)user).getVal());


    }

}
