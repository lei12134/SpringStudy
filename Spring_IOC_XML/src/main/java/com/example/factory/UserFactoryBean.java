package com.example.factory;

import com.example.bean.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author lei
 * @date 2024/3/15$
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
