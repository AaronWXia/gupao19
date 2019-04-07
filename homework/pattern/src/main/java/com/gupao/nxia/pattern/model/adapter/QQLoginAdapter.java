package com.gupao.nxia.pattern.model.adapter;

public class QQLoginAdapter implements LoginAdapter {
    @Override
    public boolean isSupport(Object adapter) {
        if(adapter instanceof  QQLoginAdapter){
            return true;
        }
        return false;
    }

    /**
     * QQ真实业务逻辑
     * @param userName
     * @param password
     * @return
     */
    @Override
    public boolean login(String userName, String password) {
        return false;
    }
}
