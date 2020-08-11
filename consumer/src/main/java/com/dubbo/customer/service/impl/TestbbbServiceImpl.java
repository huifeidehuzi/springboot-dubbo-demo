package com.dubbo.customer.service.impl;

import com.alibaba.dubbo.common.extension.Activate;
import com.dubbo.customer.Testaaaa;
import com.dubbo.customer.service.TestService;
import com.dubbo.customer.service.TestServiceA;


@Activate(group = "groupa")
public class TestbbbServiceImpl implements TestServiceA {
    @Override
    public void printInfo(Testaaaa testaaaa) {
        System.out.println("TestbbbbServiceImpl");
    }

    @Override
    public void setTestService(TestService testService) {
        //System.out.println(testService.getClass().getName());
    }
}
