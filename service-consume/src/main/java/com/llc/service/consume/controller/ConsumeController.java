package com.llc.service.consume.controller;

import com.llc.service.consume.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author llc
 * @Description
 * @Date 2019/6/19 10:41
 */
@RestController
public class ConsumeController {

    @Autowired
    private ConsumeService consumeService;

    @RequestMapping("consume/hello")
    public String hello(){
        return consumeService.sayHello();
    }
}
