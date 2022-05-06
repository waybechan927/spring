package com.chenweibin.service.impl;

import com.chenweibin.Dao.UserDao;
import com.chenweibin.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author waybechan
 * @create 2022-05-06-19:20
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
}
