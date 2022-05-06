package com.chenweibin.factory;

import com.chenweibin.UserDao;
import com.chenweibin.impl.UserDaolmpl;

/**
 * @author waybechan
 * @create 2022-05-05-18:26
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaolmpl();
    }
}
