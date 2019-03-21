package com.example.consumer.service.fallback;

import com.example.consumer.domain.ResultData;
import com.example.consumer.service.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Author     ：Dreama
 * @ Date       ：Created in 9:17 2019/03/21
 * @ Description：
 * @Version:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public ResultData hello1(@RequestParam(value = "name") String name) {
        ResultData temp = new ResultData();
        temp.setName("hello,productor1 is relax,i'm you redis");
        return temp;
    }
}
