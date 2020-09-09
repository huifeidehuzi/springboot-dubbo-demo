package com.dubbo.customer.service.impl;

import com.dubbo.api.service.CallbackService;
import org.springframework.stereotype.Service;

@Service
public class CallbackServiceImpl implements CallbackService {
    @Override
    public String printCallbackInfo(String info) {
        System.out.println(info);
        return info + "啊啊啊啊";
    }
}
