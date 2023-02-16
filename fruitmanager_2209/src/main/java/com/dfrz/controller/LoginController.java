package com.dfrz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    //设置默认首页为 login.html
    @RequestMapping("/")
    public String setMainPage(){
        return "forward:login.html";
    }

}
