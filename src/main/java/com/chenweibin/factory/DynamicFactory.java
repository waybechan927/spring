package com.chenweibin.factory;

import com.chenweibin.Dao.UserDao;
import com.chenweibin.Dao.impl.UserDaolmpl;

/**
 * @author waybechan
 * @create 2022-05-05-18:31
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaolmpl();
    }
}
