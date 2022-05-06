package com.chenweibin.test;

import com.chenweibin.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author waybechan
 * @create 2022-05-03-18:45
 */
public class SpringTest {
    @Test
    //测试scope属性
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
        applicationContext.close();

    }

}
