package com.gupao.nxia.pattern.proxy.tools;

import com.gupao.nxia.pattern.proxy.Gril;
import com.gupao.nxia.pattern.proxy.Person;
import com.gupao.nxia.pattern.proxy.ProxyMedia;
import com.gupao.nxia.pattern.proxy.Rule;

public class Test {
    public static void main(String[] args) {
        Rule rule = new Rule();
        rule.setAge(16);
        rule.setBackground(11);
        rule.setJob("大内");
        rule.setShape("肤白貌美");
        Person gril = new Gril(rule);
        ProxyMediaNew proxyMediaNew = new ProxyMediaNew(new Gril(rule));
        Person person = (Person) Proxy.newProxyInstance(new NXiaClassLoader(){}, new Class[]{Person.class},proxyMediaNew);
    }
}
