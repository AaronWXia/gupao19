package com.gupao.nxia.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyMedia implements InvocationHandler {

    private Person  target;

    public  ProxyMedia(Person person){
        this.target = person;
    }

    public Object getInstance(){
       return  Proxy.newProxyInstance(getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         before();
          method.invoke(target,args);
         after();
         return  target;
    }


    public void before(){
        System.out.println("找之前。。。。。");
    }

    public void after(){
        System.out.println("找之后。。。。。");
    }
}
