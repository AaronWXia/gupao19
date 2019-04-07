package com.gupao.nxia.pattern.model.adapter;

public class ThirdLoginService extends ServiceLogin implements ThirdLogin {

    @Override
    public boolean loginForQQ(String userName, String password) {
        return processLogin(userName,password,QQLoginAdapter.class);
    }

    @Override
    public boolean loginForWechat(String userName, String password) {
        return processLogin(userName,password,WeChatLoginAdapter.class);

    }

    @Override
    public boolean loginForSlient(String userName, String password) {
        return processLogin(userName,password,SlientloginAdapter.class);

    }

    @Override
    public boolean loginForRegist(String userName, String password) {
        return processLogin(userName,password,RegistLoginAdapter.class);

    }

    @Override
    public boolean loginForTele(String userName, String password) {
        return processLogin(userName,password,TeleLoginAdapter.class);
    }


    public boolean processLogin(String userName, String password,Class<? extends LoginAdapter> clzz){
        try {
            LoginAdapter loginAdapter = clzz.newInstance();
            if(loginAdapter.isSupport(loginAdapter)){
             return  loginAdapter.login(userName,password);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }
}
