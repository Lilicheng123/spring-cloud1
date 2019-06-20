package com.llc.service.hi.api.hystrix;

import com.llc.service.hi.api.HelloService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author llc
 * @Description
 * @Date 2019/6/19 11:41
 */
@Component
@Qualifier(value ="hiHystric")
public class HiHystric implements HelloService {
    @Override
    public String sayHello() {
        return "你好啊，世界";
    }
}
