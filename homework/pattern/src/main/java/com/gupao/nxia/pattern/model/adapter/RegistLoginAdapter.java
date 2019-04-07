package com.gupao.nxia.pattern.model.adapter;

public class RegistLoginAdapter implements  LoginAdapter {
    @Override
    public boolean isSupport(Object adapter) {
        if(adapter instanceof RegistLoginAdapter){
            return true;
        }
        return  false;
    }

    @Override
    public boolean login(String userName, String password) {
        return false;
    }
}
