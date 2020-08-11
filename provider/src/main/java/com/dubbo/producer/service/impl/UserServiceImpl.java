package com.dubbo.producer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.entity.User;
import com.dubbo.api.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 用户信息公共接口实现类
 *
 * @author zhangjianfeng 2019/12/16
 */
@Component
//@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public User getUserByName(String name) {
        if (name.equals("张三")) {
            return new User(name, 18, "北京市东城区");
        }
        return new User(name, 22, "北京市西城区");
    }

    @Override
    public List<User> getUserList() {
        return Arrays.asList(new User("张三", 18, "北京市东城区"), new User("李四", 22, "北京市西城区"));
    }
}
