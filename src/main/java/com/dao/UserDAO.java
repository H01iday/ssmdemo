package com.dao;

import com.entity.User;

import java.util.List;

public interface UserDAO {

    void save(User user);

    List<User> findAll();
}
