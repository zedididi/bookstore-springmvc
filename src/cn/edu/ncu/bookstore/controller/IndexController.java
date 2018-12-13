package cn.edu.ncu.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/13  19:06
 * @package: cn.edu.ncu.bookstore.controller
 * @project: springMVCDome
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

}
