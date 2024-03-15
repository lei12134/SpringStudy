package com.example.dao;

import com.example.bean.User;

/**
 * @author lei
 * @date 2024/3/15$
 */
public class UserDao {

    private User user;


    @Override
    public String toString() {
        return "UserDao: " + user.toString();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
