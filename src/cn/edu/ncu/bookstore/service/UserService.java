package cn.edu.ncu.bookstore.service;

import cn.edu.ncu.bookstore.entity.User;

import java.util.List;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/13  15:19
 * @package: cn.edu.ncu.bookstore.service
 * @project: springMVCDome
 */
public interface UserService {

   List<User> findAll();

   User findById(int id);

   User findByUsername(String username);

   boolean login(User user);
   boolean register(User user);

   boolean updateUser(User user);
}
