package com.gupao.nxia.pattern.model.adapter;


/*
* 原始版本
 */
public class ServiceLogin implements Login {

    @Override
    public boolean login(String userName, String password) {
        return false;
    }

    @Override
    public boolean register(String userName, String password) {
        return false;
    }
}
