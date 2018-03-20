package com.cs.controller.user;

import com.cs.controller.TestController;
import com.cs.srevice.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    public static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/foo",method = RequestMethod.GET, produces = "text/html; charset=utf-8")
    public @ResponseBody String getShopInJSON(@RequestParam(required = false, value = "name") String name,
                                              HttpServletRequest request) {
        logger.info("谁====="+name);
        return (name + "你好!" + "欢迎"+name +"到来！");
    }

    @RequestMapping(value="/login",method = RequestMethod.GET, produces = "text/html; charset=utf-8")
    public @ResponseBody String userLogin(@RequestParam(required = false, value = "userName") String userName,
                            @RequestParam(required = false, value = "pwd") Long passsword,
                         HttpServletRequest request) {
        logger.info("谁====="+userName);
        logger.info("密码====="+passsword);
       return userService.userLogin(userName, passsword);
    }
}
