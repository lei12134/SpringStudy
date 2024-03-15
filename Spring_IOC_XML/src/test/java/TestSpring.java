import com.example.dao.AdminDao;
import com.example.dao.DeviceDao;
import com.example.dao.UserDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author lei
 * @date 2024/3/15$
 */
public class TestSpring {

    public static void main(String[] args) {
        DI_Case();
    }

//    创建 spring 容器
//        1. 使用 ApplicationContext 接口
    public static ApplicationContext createSpringCountainer1(){
//         1. ClassPathXmlApplicationContext: 加载项目路径下的配置文件(相对路径)
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        2. FileSystemXmlApplicationContext: 加载任意路径下的文件(绝对路径)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        3. AnnotationConfigApplicationContext: 读取注解创建实例
        return applicationContext;
    }
//        2. 使用 BeanFactory 接口: 已废弃，不推荐使用
    public BeanFactory createSpringCountainer2(){
        DefaultListableBeanFactory defaultListableBeanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader=new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        return defaultListableBeanFactory;
    }


//    控制反转: 创建 bean
    public static void IOC_Case(){
        ApplicationContext applicationContext = createSpringCountainer1();
//        1.通过类型获取 bean: 容器中同一类型的 bean 唯一
//        UserDao userDao = applicationContext.getBean(UserDao.class);
        // 2.通过 id 获取 bean
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        System.out.println(userDao.toString());
    }

//    依赖注入
    public static void DI_Case(){
        ApplicationContext applicationContext = createSpringCountainer1();
//        1. 构造方法注入: applicationContext.xml文件配置
        DeviceDao deviceDao = applicationContext.getBean(DeviceDao.class);
//        2. setter 方法注入: applicationContext.xml文件配置
        AdminDao adminDao = applicationContext.getBean(AdminDao.class);
        System.out.println(deviceDao);
        System.out.println(adminDao);
    }
}
