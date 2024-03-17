import com.example.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author lei
 * @date 2024/3/18$
 */
class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setEmail(resultSet.getString("email"));
        return user;
    }
}

public class JdbcTemplateTest {

    @Test
    public void TestCase1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
        // 插入
//        jdbcTemplate.update("insert into users(id, name, email) values(4, '王五', '15974652.@qq.com')");
        // 更新
        jdbcTemplate.update("update users set name=? where id=?","李一", 4);
//        // 删除
//        jdbcTemplate.update("delete users where id=?",4);
        // 查询所有
//        List<User> userList = jdbcTemplate.query("select * from users where id>?",new UserRowMapper(),0);
//        for (User user: userList) {
//            System.out.println(user);
//        }
//        // 查询返回一行一列：使用聚合函数，在不使用 group by 字句时，都是返回一行一列。最常用的就是分页中获取总记录条数
//        int count = jdbcTemplate.queryForObject("select count(*) from users where id>?",Integer.class,0);
//        System.out.println(count);

    }
}
