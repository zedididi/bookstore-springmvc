package cn.edu.ncu.bookstore.controller;

import cn.edu.ncu.bookstore.entity.Category;
import cn.edu.ncu.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/12  18:11
 * @package: cn.edu.ncu.bookstore.controller
 * @project: springMVCDome
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value="/view")
    public String viewCategory(Model model){
        List<Category> list=categoryService.findAll();
        model.addAttribute("category",list);
        return "main";
    }

    @RequestMapping(value="/view1")
    @ResponseBody
    public List<Category> viewCategory1(){
        List<Category> list=categoryService.findAll();
        return list;
    }

    @RequestMapping(value = "/modelView")
    public ModelAndView showCategory(ModelAndView model){
        List<Category> list=categoryService.findAll();
        model.setViewName("main");
        model.addObject("category",list);
        return model;
    }
}



