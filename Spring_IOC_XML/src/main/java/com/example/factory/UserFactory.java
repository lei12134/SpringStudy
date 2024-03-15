package com.example.factory;

import com.example.bean.User;

/**
 * @author lei
 * @date 2024/3/15$
 */
public class UserFactory {
    public static User getUser1(){
        return new User();
    }

    public User getUser2(){
        return new User();
    }
}
