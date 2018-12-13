package cn.edu.ncu.bookstore.dao;

import cn.edu.ncu.bookstore.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/12  15:21
 * @package: cn.edu.ncu.bookstore.controller
 * @project: springMVCDome
 */

@Repository
public interface CategoryDao {
    List<Category> findAll();
}
