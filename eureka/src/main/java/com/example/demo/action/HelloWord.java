package com.example.demo.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Dreama
 * @ Date       ：Created in 16:31 2019/03/18
 * @ Description：
 * @Version:
 */
@RestController
public class HelloWord {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "hello word";
    }
}
