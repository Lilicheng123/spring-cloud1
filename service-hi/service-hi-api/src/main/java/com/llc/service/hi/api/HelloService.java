package com.llc.service.hi.api;

import com.llc.service.hi.api.hystrix.HiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
@FeignClient(value="SERVICE-HI",fallback = HiHystric.class)
public interface HelloService {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    String sayHello();
}
