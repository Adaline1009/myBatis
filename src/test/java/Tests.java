import com.alt.hrm.mappers.UserMapper;
import com.alt.hrm.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@EnableConfigurationProperties
public class Tests
{
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAllUsers() {
        List<User> users = userMapper.findAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

/*
    @Test
    public void findUserById() {
        User user = userMapper.findUserById(1);
        assertNotNull(user);
    }
*/
 /*   @Test
    public void createUser() {
        User user = new User(0, "Siva", "siva@gmail.com");
        userMapper.insertUser(user);
        User newUser = userMapper.findUserById(user.getId());
        assertEquals("Siva", newUser.getName());
        assertEquals("siva@gmail.com", newUser.getEmail());
    }*/
}