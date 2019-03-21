package com.example.consumer.controller;

import com.example.consumer.domain.ResultData;
import com.example.consumer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Dreama
 * @ Date       ：Created in 16:22 2019/03/20
 * @ Description：
 * @Version:
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello1/{name}")
    public ResultData index(@PathVariable("name") String name) {
        return helloRemote.hello1(name);
    }
}
