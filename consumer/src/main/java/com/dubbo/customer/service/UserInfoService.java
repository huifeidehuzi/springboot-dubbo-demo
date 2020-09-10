package com.dubbo.customer.service;

import com.dubbo.api.entity.User;
import com.dubbo.api.service.CallbackService;

import java.util.List;

/**
 * 用户信息服务
 *
 * @author zhangjianfeng 2019/12/16
 */
public interface UserInfoService {

    /**
     * 获取用户信息
     *
     * @param name 用户姓名
     * @return User
     */
    User getUserByName(String name);

    /**
     * 获取用户列表
     *
     * @return List<User>
     */
    List<User> getUserList();

    void callback();

    void genericServiceTest(String body);
}
