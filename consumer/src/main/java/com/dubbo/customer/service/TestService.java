package com.dubbo.customer.service;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;
import com.dubbo.customer.Testaaaa;

@SPI("impl")
public interface TestService {

    @Adaptive
    void printInfo(Testaaaa testaaaa);

    void setTestSeviceA(TestServiceA testSeviceA);
}
