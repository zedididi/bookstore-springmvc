package cn.edu.ncu.bookstore.service;

import cn.edu.ncu.bookstore.dao.CategoryDao;
import cn.edu.ncu.bookstore.entity.Category;
import org.junit.Test;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/12  17:04
 * @package: cn.edu.ncu.bookstore.service
 * @project: springMVCDome
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryDao categoryDao;


    public List<Category> findAll(){
        return  categoryDao.findAll();
    }
}
