package com.dubbo.customer.service.impl;

import com.dubbo.api.entity.User;
import com.dubbo.api.service.CallbackService;
import com.dubbo.api.service.UserService;
import com.dubbo.customer.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 获取用户信息实现类
 *
 * @author zhangjianfeng 2019/12/16
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserService userService;
    @Autowired
    private CallbackService callbackService;

    @Override
    public User getUserByName(String name) {
        return userService.getUserByName(name);
    }

    @Override
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @Override
    public void callback() {
        userService.callback(callbackService);
    }
}
