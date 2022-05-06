package com.chenweibin.Dao.impl;

import com.chenweibin.Dao.UserDao;

/**
 * @author waybechan
 * @create 2022-04-23-23:23
 */
public class UserDaolmpl implements UserDao {

    public UserDaolmpl() {
        System.out.println("无参构造");
    }

    public void init(){
        System.out.println("初始化方法");
    }

    public void destroy(){
        System.out.println("销毁方法");
    }

    @Override
    public void save() {
        System.out.println("savg running");
    }
}
