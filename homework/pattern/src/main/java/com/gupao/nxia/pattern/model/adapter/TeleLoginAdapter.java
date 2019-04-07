package com.gupao.nxia.pattern.model.adapter;

public class TeleLoginAdapter implements  LoginAdapter {
    @Override
    public boolean isSupport(Object adapter) {
         if(adapter instanceof TeleLoginAdapter){
             return true;
         }
         return false;
    }

    @Override
    public boolean login(String userName, String password) {
        return false;
    }
}
