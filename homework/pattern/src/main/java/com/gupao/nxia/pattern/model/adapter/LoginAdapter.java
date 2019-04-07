package com.gupao.nxia.pattern.model.adapter;

public interface LoginAdapter {

    boolean isSupport(Object adapter);

    boolean login(String userName, String password);
}
