import com.example.dao.AdminDao;
import com.example.dao.UserDao;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lei
 * @date 2024/3/18$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext1.xml")
public class AdminDaoTest {
    @Resource(name = "adminDao")
    private AdminDao adminDao;

    @Test
    public void testUserDao(){
        adminDao.add();
        adminDao.addInfo();
        adminDao.delete();
        adminDao.update();
        adminDao.find();
    }
}
