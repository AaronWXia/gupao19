package com.gupao.nxia.pattern.proxy.tools;
import com.gupao.nxia.pattern.proxy.Person;
import com.gupao.nxia.pattern.proxy.Rule;
import java.lang.reflect.*;

import static com.oracle.jrockit.jfr.ContentType.Class;

public final class $Proxy0 extends Proxy implements com.gupao.nxia.pattern.proxy.Person{
    public $Proxy0(NXInvocationHandler invocationhandler)
    {
        super(invocationhandler);
    }
    public void findLove (Rule rule) throws NoSuchMethodException {
        Method m = com.gupao.nxia.pattern.proxy.Person.class.getMethod("findLove",new Class[]{});
    }}
