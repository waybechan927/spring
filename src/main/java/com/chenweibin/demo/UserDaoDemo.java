package com.chenweibin.demo;

import com.chenweibin.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author waybechan
 * @create 2022-05-03-18:24
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
}
