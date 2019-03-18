package com.gupao.nxia.pattern.sigleton;

/**
 * 懒汉式
 */
public class Application {
    private static  Application  application=new Application();


    private   Application(){

    }

    public static  Application getApplication(){
            return application;
    }


}
