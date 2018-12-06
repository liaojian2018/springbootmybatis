package com.ifeng.service;

import com.ifeng.model.User;

/**
 * @author liaojian
 * @create 2018-12-04 14:23
 */
public interface UserService {
    int addUser(User user);

    User queryUserById(Integer userId);
}
