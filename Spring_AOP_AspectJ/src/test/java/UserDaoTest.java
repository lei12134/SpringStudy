import com.example.dao.UserDao;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lei
 * @date 2024/3/17$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Test
    public void testUserDao(){
        userDao.add();
        userDao.addInfo();
        userDao.delete();
        userDao.find();
        userDao.update();
    }
}
