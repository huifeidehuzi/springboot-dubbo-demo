package com.dubbo.producer.filter;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

@Activate(group = "provider")
public class MyFilter implements Filter {


    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println(invoker.getInterface().getName() + "=========filter");

        return null;
    }
}
