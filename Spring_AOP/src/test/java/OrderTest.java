import com.example.dao.OrderDao;
import jakarta.annotation.Resource;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;

/**
 * @author lei
 * @date 2024/3/16$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OrderTest {
    @Resource(name = "orderDaoProxy")
    OrderDao orderDao;

    @Test
    public void testDao(){
        orderDao.add();
        orderDao.update();
        orderDao.delete();
        orderDao.find();
    }
}
