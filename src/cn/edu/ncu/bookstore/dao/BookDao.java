package cn.edu.ncu.bookstore.dao;

import cn.edu.ncu.bookstore.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/12  23:46
 * @package: cn.edu.ncu.bookstore.dao
 * @project: springMVCDome
 */

@Repository
public interface BookDao {
    List<Book> findBookByCategoryId(@Param("id") String id);
}
