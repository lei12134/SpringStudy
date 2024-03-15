package com.example.dao;

import com.example.bean.User;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author lei
 * @date 2024/3/15$
 */
// @Service | @Controller
@Repository("userDao")  // @Component 范围的细化，用于数据层
public class UserDao {

//    @Autowired  // 自动装配，按照类型注入; 基于 反射 机制实现，不需要 setter 方法
//    @Qualifier("user")
    @Resource(name="user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "user=" + user +
                '}';
    }
}
