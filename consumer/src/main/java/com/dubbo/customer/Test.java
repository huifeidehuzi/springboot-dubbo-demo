package com.dubbo.customer;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.dubbo.customer.service.TestService;
import com.dubbo.customer.service.TestServiceA;

import java.util.ServiceLoader;

public class Test {

    public static void main(String[] args) {
        URL url = URL.valueOf("test://localhost/test?name=impl");
        TestService testService = ExtensionLoader.getExtensionLoader(TestService.class).getExtension("impla");
        Testaaaa a = new Testaaaa();
        a.setUrl(url);
        testService.printInfo(a);

        TestServiceA testServiceA = ExtensionLoader.getExtensionLoader(TestServiceA.class).getAdaptiveExtension();
        a.setUrl(URL.valueOf("test://localhost/test"));
        testServiceA.printInfo(a);

        /*ServiceLoader<TestService> t =  ServiceLoader.load(TestService.class);
        t.forEach(e->{
            e.printInfo(null);
        });*/
    }
}
