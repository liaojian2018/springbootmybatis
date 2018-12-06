package com.ifeng.controller;

import com.ifeng.model.User;
import com.ifeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author liaojian
 * @create 2018-12-04 14:20
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(value = "/add")
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping(value = "/get/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.queryUserById(id);
    }
}
