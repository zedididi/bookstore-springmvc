package cn.edu.ncu.bookstore.service;

import cn.edu.ncu.bookstore.dao.BookDao;
import cn.edu.ncu.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/12  23:48
 * @package: cn.edu.ncu.bookstore.service
 * @project: springMVCDome
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public List<Book> findBookByCategoryId(String id){
        return bookDao.findBookByCategoryId(id);

    }
}
