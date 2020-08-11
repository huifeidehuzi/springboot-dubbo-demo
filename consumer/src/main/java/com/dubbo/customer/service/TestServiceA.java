package com.dubbo.customer.service;

import com.alibaba.dubbo.common.extension.SPI;
import com.dubbo.customer.Testaaaa;

@SPI
public interface TestServiceA {

    void printInfo(Testaaaa testaaaa);

    void setTestService(TestService testService);
}
