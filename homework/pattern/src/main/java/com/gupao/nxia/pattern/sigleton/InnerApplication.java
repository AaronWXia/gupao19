package com.gupao.nxia.pattern.sigleton;

public class InnerApplication {


    private  InnerApplication(){

    }

    public  static InnerApplication getInstance(){
        return  ApplicationHolder.innerApplication;
    }

    static class ApplicationHolder{
        //内部类懒汉式
        private  static  InnerApplication innerApplication = new InnerApplication();
    }
}
