package com.gupao.nxia.pattern.model.adapter;

public interface ThirdLogin {

    boolean loginForQQ(String userName, String password);

    boolean loginForWechat(String userName, String password);

    boolean loginForSlient(String userName, String password);

    boolean loginForRegist(String userName, String password);

    boolean  loginForTele(String userName, String password);
}
