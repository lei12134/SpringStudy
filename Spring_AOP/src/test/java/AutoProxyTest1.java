import com.example.dao.CustomerDao;
import com.example.dao.OrderDao;
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
@ContextConfiguration(locations = "classpath:applicationContext1.xml")
public class AutoProxyTest1 {
    //不用引用生成代理对象,因为本身就是就是代理对象
    @Resource(name = "customerDao")
    private CustomerDao customerDao;
    @Resource(name = "orderDao")
    private OrderDao orderDao;

    @Test
    public void testDao(){
        customerDao.find();
        customerDao.delete();
        customerDao.update();
        customerDao.add();

        orderDao.find();
        orderDao.delete();
        orderDao.update();
        orderDao.add();
    }
}
