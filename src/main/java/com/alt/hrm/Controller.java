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
    public List<User> getUserById(@PathVariable Integer id) {

        return userMapper.findAllUsers();
    }
}