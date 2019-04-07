package com.gupao.nxia.pattern.model.adapter;

public class WeChatLoginAdapter implements LoginAdapter {
    @Override
    public boolean isSupport(Object adapter) {
        if(adapter instanceof  WeChatLoginAdapter){
            return true;
        }
        return false;
    }


    /**
     * 真实
     * @param userName
     * @param password
     * @return
     */
    @Override
    public boolean login(String userName, String password) {
        return false;
    }
}
