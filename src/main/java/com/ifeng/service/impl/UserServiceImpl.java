package com.ifeng.service.impl;

import com.ifeng.dao.UserMapper;
import com.ifeng.model.User;
import com.ifeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liaojian
 * @create 2018-12-04 14:24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User queryUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
