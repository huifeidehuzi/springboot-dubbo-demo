package com.dubbo.producer.listener;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.ExporterListener;
import com.alibaba.dubbo.rpc.RpcException;

@Activate
public class MyListener implements ExporterListener {

    @Override
    public void exported(Exporter<?> exporter) throws RpcException {
        System.out.println("暴露完成调用"+exporter.getInvoker().getInterface().getName());
    }
    @Override
    public void unexported(Exporter<?> exporter) {
        System.out.println("服务没有暴露完成调用"+exporter.getInvoker().getInterface().getName());
    }
}
