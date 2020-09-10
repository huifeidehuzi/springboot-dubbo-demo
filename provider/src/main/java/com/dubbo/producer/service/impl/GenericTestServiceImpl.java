package com.dubbo.producer.service.impl;

import com.dubbo.producer.service.GenericTestService;
import org.springframework.stereotype.Service;

@Service
public class GenericTestServiceImpl implements GenericTestService {

    @Override
    public void printInfo(String body) {
        System.out.println(body);
    }
}
