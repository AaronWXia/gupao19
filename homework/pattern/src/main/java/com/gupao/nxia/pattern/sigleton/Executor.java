package com.gupao.nxia.pattern.sigleton;

public class Executor implements Runnable{


    @Override
    public void run() {
        JavaApplication lazySingleton = JavaApplication.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
    }
}
