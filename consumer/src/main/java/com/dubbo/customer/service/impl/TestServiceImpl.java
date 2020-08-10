package com.dubbo.customer.service.impl;

import com.dubbo.customer.Testaaaa;
import com.dubbo.customer.service.TestService;
import com.dubbo.customer.service.TestServiceA;


public class TestServiceImpl implements TestService {
    @Override
    public void printInfo(Testaaaa testaaaa) {
        System.out.println("我是实现类");
    }

    @Override
    public void setTestSeviceA(TestServiceA testSeviceA) {
        System.out.println(testSeviceA.getClass().getName());
    }
}
