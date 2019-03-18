package com.gupao.nxia.pattern.sigleton;

import java.util.HashMap;
import java.util.Map;

public class ApplicationRegistry {

    private static Map<String,Object> singleContainer = new HashMap<>();

    private ApplicationRegistry(){

    }
    public static Object getInstance(String key){
        if(singleContainer.containsKey(key)&&singleContainer.get(key)!=null){
            return singleContainer.get(key);
        }else{
            Object object = null;
            try {
                object = Class.forName(key);
                singleContainer.put(key,object);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return object;
        }
    }
}
