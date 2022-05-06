package com.chenweibin.demo;

import com.chenweibin.service.UserService;
import com.chenweibin.service.impl.UserServiceImpl;

/**
 * @author waybechan
 * @create 2022-05-06-19:23
 */
public class UserController {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.save();
    }
}
