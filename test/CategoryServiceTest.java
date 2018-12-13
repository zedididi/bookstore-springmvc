import cn.edu.ncu.bookstore.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/12  17:55
 * @package: cn.edu.ncu.bookstore.service
 * @project: springMVCDome
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findAll(){
        System.out.println(categoryService.findAll().toString());
    }
}
