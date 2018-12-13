package cn.edu.ncu.bookstore.dao;

import cn.edu.ncu.bookstore.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/13  12:38
 * @package: cn.edu.ncu.bookstore.dao
 * @project: springMVCDome
 */
@Repository
public interface UserDao {
    List<User> findAll();
    //List<User> findAllByUsername(String username);
    User findById(int id);
    User findByUsername(String username);
    int addUser(User user);
    int updateUser(User user);
}
