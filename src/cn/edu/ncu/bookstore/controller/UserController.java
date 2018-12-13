package cn.edu.ncu.bookstore.controller;

import cn.edu.ncu.bookstore.entity.User;
import cn.edu.ncu.bookstore.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/13  12:44
 * @package: cn.edu.ncu.bookstore.controller
 * @project: springMVCDome
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //得到一个用来记录日子的对象，这样打印信息的时候就能标记打印的是哪个类的信息
    private static final Log logger=LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@ModelAttribute("user") User user, HttpSession session, Model model){
        System.out.println("login :" + user);
        if (userService.login(user)){
            session.setAttribute("u",user);
            logger.info("成功");
            return "main";
        }else {
            logger.info("失败");
            model.addAttribute("messageError","用户名或密码错误");
            return "login";
        }
        /*int id= Integer.parseInt(request.getParameter("id"));
        request.setAttribute("user",userService.findById(id));
        return "main";*/
    }
    @RequestMapping("/register")
    public String register(@ModelAttribute("user") User user,Model model){
        if (userService.register(user)){
            logger.info("成功");
            return "login";
        }else {
            logger.info("失败");
            model.addAttribute("messageError","用户名已存在");
            return "register";
        }
    }

}
