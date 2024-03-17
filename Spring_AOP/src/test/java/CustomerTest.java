import com.example.dao.CustomerDao;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lei
 * @date 2024/3/16$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerTest {
    // 注入代理对象
    @Resource(name = "customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void testCustomer(){
        customerDao.add();
        customerDao.update();
        customerDao.delete();
        customerDao.find();
    }
}
