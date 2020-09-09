package com.dubbo.customer.controller;


import com.dubbo.api.entity.User;
import com.dubbo.api.service.CallbackService;
import com.dubbo.customer.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息控制器
 *
 * @author zhangjianfeng 2019/12/16
 */
@RestController
public class UserController {


    @Autowired
    private UserInfoService userInfoService;

    /**
     * 获取用户
     *
     * @param name 用户姓名
     * @return User
     */
    @RequestMapping("/getuser")
    public User getUser(String name) {
        return userInfoService.getUserByName(name);
    }

    /**
     * 回调测试
     *
     * @return User
     */
    @RequestMapping("/callback")
    public void callback() {
        userInfoService.callback();
    }


}
