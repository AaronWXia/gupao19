package com.gupao.nxia.pattern.sigleton;


/**
 * 饿汉式:
 * 线程安全:doublecheck
 *
 * 变量前加 volatile 可以防止指令重排序.
 * volatile不能保证原子性
 */
public class JavaApplication {
    private static volatile  JavaApplication ourInstance;

    private JavaApplication() {

    }

    public static JavaApplication getInstance() {
        if(ourInstance==null){
            synchronized (JavaApplication.class){
                if(ourInstance==null){
                    ourInstance = new JavaApplication();
                }
            }
        }
        return ourInstance;
    }
}
