package com.example.dao;

import org.springframework.stereotype.Repository;

/**
 * @author lei
 * @date 2024/3/17$
 */
@Repository(value = "userDao") //注解的方式,spring管理对象的创建
public class UserDao {
    public void add(){
        System.out.println("添加用户");
    }
    public void addInfo(){
        System.out.println("添加用户信息");
    }
    public void update(){
        System.out.println("更新用户");
    }
    public void delete(){
        System.out.println("删除用户");
    }
    public void find(){
        System.out.println("查找用户");
    }
}
