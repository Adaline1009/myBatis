package com.alt.hrm;

import com.alt.hrm.mappers.UserMapper;
import com.alt.hrm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
class Controller {
@Autowired
    private  UserMapper userMapper;



    @GetMapping("/{id}")
    @CrossOrigin
    public List<User> getClubById(@PathVariable Integer id) {
    //    User user = new User(1, "Siva", "siva@gmail.com");

       // userMapper.insertUser(user);

        return userMapper.findAllUsers();
    }
}