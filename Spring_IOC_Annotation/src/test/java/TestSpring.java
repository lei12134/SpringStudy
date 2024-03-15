import com.example.dao.UserDao;
import com.example.service.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lei
 * @date 2024/3/15$
 */
public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext applicationContext = createSpringContainer2();
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao);
    }

    public static ApplicationContext createSpringContainer1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        return applicationContext;
    }
    public static ApplicationContext createSpringContainer2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        return applicationContext;
    }
}
