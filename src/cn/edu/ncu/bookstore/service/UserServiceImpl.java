package cn.edu.ncu.bookstore.service;

import cn.edu.ncu.bookstore.dao.UserDao;
import cn.edu.ncu.bookstore.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/13  12:41
 * @package: cn.edu.ncu.bookstore.service
 * @project: springMVCDome
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll(){  //查找所有用户
        return userDao.findAll();
    }

    @Override
    public User findById(int id){ //按id查找

        return userDao.findById(id);
    }

    @Override
    public User findByUsername(String username){//按username 用户名查找

        return userDao.findByUsername(username);
    }

    @Override
    public boolean login(User user) {      //登陆逻辑实现
        User getUser=findByUsername(user.getUsername());

        if (getUser==null)
            return false;
        else
            if (getUser.getPassword().equals(user.getPassword()))
            return true;
        return false;
    }

    @Override
    public boolean register(User user) {    //注册逻辑实现  可以充当addUser()

        User getUser=findByUsername(user.getUsername());
        if (getUser==null||!getUser.getPassword().equals(user.getPassword()))
            if (userDao.addUser(user)>0)
                return true;
        return false;
    }

    @Override
    public boolean updateUser(User user) { //更新用户信息
        if (userDao.updateUser(user)>0)
            return true;
        return false;
    }

    public void addUser(User user){
        userDao.addUser(user);
    }
}
