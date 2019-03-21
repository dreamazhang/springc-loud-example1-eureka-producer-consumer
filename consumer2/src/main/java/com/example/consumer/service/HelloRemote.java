package com.example.consumer.service;

import com.example.consumer.domain.ResultData;
import com.example.consumer.service.fallback.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Author     ：Dreama
 * @ Date       ：Created in 17:19 2019/03/19
 * @ Description：
 * @Version:
 */
@FeignClient(name= "spring-cloud-producer2",fallback = HelloRemoteHystrix.class)
public interface HelloRemote{
    @RequestMapping(value = "/helloget")
    public ResultData hello2(@RequestParam(value = "name") String name);
}
