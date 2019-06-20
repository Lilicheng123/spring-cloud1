package com.llc.service.consume.service.impl;

import com.llc.service.consume.service.ConsumeService;
import com.llc.service.hi.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author llc
 * @Description
 * @Date 2019/6/19 11:35
 */
@Service
public class ConsumeServiceImpl implements ConsumeService {

    @Autowired
    private HelloService helloService;

    @Override
    public String sayHello() {
        return helloService.sayHello();
    }
}
