package com.dubbo.producer.service.impl;

import com.dubbo.api.entity.User;
import com.dubbo.api.service.CallbackService;
import com.dubbo.api.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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


    private List<CallbackService> callbackServices = new ArrayList<>();

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

    @Override
    public void callback(CallbackService callbackService) {
        callbackServices.add(callbackService);
    }


    public UserServiceImpl() {
        new Thread(() -> {
            while (true) {
                callbackServices.forEach(e -> {
                    System.out.println(e.printCallbackInfo("哇哇哇哇哇哇哇哇哇哇"));
                });

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
