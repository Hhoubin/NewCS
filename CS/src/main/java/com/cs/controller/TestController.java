package com.cs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class TestController {
    public static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping(value="/foo",method = RequestMethod.GET, produces = "text/html; charset=utf-8")
    public @ResponseBody String getShopInJSON(@RequestParam(required = false, value = "name") String name,
                                              HttpServletRequest request) {
        logger.info("谁====="+name);
        return (name + "你好!" + "欢迎"+name +"到来！");
    }
}
