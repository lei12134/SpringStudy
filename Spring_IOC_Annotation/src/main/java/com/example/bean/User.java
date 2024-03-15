package com.example.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author lei
 * @date 2024/3/15$
 */
@Component("user")  // 等同于 <bean> 标签
@Scope("singleton")
public class User {
    @Value("15")    // 注入基本类型的值
    private int userId;
    @Value("lei")
    private String userName;
    @Value("123456")
    private String userPassword;

    @PostConstruct  // init-method
    public void init(){}

    @PreDestroy     // destroy-method
    public void destroy(){}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
