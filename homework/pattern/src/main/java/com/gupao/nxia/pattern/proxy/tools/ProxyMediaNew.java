package com.gupao.nxia.pattern.proxy.tools;

import com.gupao.nxia.pattern.proxy.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyMediaNew  implements  NXInvocationHandler {

    private Person target;
    public ProxyMediaNew(Person target){
        this.target = target;
    }

    public Object getInstance(){
        return null;
    }


    @Override
    public Object invocation(Object target, Method method, Object args) {
        try {
            method.invoke(this.target,method,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
