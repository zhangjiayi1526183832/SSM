package com.zhang.factory;

import com.zhang.pojo.User;
import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {
    public User getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }
}

