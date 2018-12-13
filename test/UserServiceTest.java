import cn.edu.ncu.bookstore.entity.User;
import cn.edu.ncu.bookstore.service.UserService;
import cn.edu.ncu.bookstore.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/13  13:18
 * @package: PACKAGE_NAME
 * @project: springMVCDome
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})

public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void findAll(){
        System.out.println(userService.findAll());
    }

    @Test
    public void findById(){
        System.out.println(userService.findById(1));
    }

    @Test
    public void findByUsername() {
        System.out.println(userService.findByUsername("刘泽迪"));
    }

    @Test
    public void addUser(){
        User user=new User();
       /* user.setId(3);
        user.setUsername("苏枫12");
        user.setAddress("124qweqwe23");
        user.setCellphone("123123");
        user.setEmail("21432312");
        user.setPhone("21341");
        user.setPassword("aqwqwqw");*/
       user=userService.findById(4);
        System.out.println(user);
       user.setEmail("111122222222222222222222211111111");
        userService.updateUser(user);
    }
}
