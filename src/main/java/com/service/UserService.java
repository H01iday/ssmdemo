package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
}
