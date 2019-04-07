package com.gupao.nxia.pattern.proxy.tools;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

public interface NXInvocationHandler {

    //
    public Object invocation(Object target, Method method,Object args);
}
