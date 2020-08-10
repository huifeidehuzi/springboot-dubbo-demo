package com.dubbo.customer.service;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;
import com.dubbo.customer.Testaaaa;

@SPI("implaaa")
public interface TestServiceA {

    @Adaptive
    void printInfo(Testaaaa testaaaa);

}
