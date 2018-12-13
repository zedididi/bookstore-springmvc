package cn.edu.ncu.bookstore.controller;

import cn.edu.ncu.bookstore.entity.Book;
import cn.edu.ncu.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/13  0:00
 * @package: cn.edu.ncu.bookstore.controller
 * @project: springMVCDome
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

   /* @RequestMapping("")
    public String showBookByCategoryId(@RequestParam("id")String id, Model model){
        model.addAttribute("books",bookService.findBookByCategoryId(id));
        return "main";
    }*/

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public String getBookByCategoryId(@PathVariable("id")String id,Model model){
        model.addAttribute("books",bookService.findBookByCategoryId(id));
        return "main";
    }

    @RequestMapping("view")
    public String findBookByCategoryId(HttpServletRequest request){
        String id=request.getParameter("id");
        request.setAttribute("books",bookService.findBookByCategoryId(id));
        return "main";
    }

    @RequestMapping(value = "/json")
    @ResponseBody
    public List<Book> test(HttpServletRequest request,HttpServletRequest response){
        String id=request.getParameter("id");
        return  bookService.findBookByCategoryId(id);
    }

    @RequestMapping("")
    @ResponseBody            //返回json数据
    public List<Book> showBookByCategoryId(@RequestParam("id")String id, Model model){
        List<Book> list=bookService.findBookByCategoryId(id);
        model.addAttribute("books",list);
        return list;
    }
}
