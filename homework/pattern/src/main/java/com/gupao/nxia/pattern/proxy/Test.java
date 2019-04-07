package com.gupao.nxia.pattern.proxy;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        Rule rule = new Rule();
        rule.setAge(16);
        rule.setBackground(11);
        rule.setJob("大内");
        rule.setShape("肤白貌美");
        Person gril = new Gril(rule);
        Person proxyMedia = (Person) new ProxyMedia(gril).getInstance();
        try {
            proxyMedia.findLove(rule);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream os =null;
        try {
            os = new FileOutputStream("I:"+ File.separator+"$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
