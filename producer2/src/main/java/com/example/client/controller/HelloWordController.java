package com.example.client.controller;

import com.example.client.controller.domain.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author     ：Dreama
 * @ Date       ：Created in 9:10 2019/03/19
 * @ Description：
 * @Version:
 */
@Controller
//使用该注解支持跨域
@CrossOrigin
class HelloWorldController {
    @RequestMapping(value = "/helloget")
    @ResponseBody
    public ResultData helloget(String name) {
        ResultData result = new ResultData();
        result.setId("producer2");
        result.setName(name);
        return result ;
    }
}
