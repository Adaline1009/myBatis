package com.alt.hrm.mappers;

import com.alt.hrm.model.User;


import java.util.List;

public interface UserMapper {

        void insertUser(User user);
        User findUserById(Integer id);
        List<User> findAllUsers();

}
