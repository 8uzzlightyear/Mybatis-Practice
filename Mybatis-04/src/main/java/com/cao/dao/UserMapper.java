package com.cao.dao;

import com.cao.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(int i);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

}
