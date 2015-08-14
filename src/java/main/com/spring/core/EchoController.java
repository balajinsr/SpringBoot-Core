package com.spring.core;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class EchoController {

    @RequestMapping("/")
    @ResponseBody
    public String echo() {
        return "Alive!";
    }
}