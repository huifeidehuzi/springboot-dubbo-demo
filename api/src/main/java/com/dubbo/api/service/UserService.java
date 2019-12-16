package com.dubbo.api.service;

import com.dubbo.api.entity.User;

import java.util.List;

/**
 * 公共用户信息接口
 *
 * @author zhangjianfeng 2019/12/16
 */
public interface UserService {

    /**
     * 用户信息公共接口
     *
     * @param name 用户姓名
     * @return User
     */
    User getUserByName(String name);

    /**
     * 用户列表公共接口
     *
     * @return List<User>
     */
    List<User> getUserList();
}
