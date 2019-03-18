package com.gupao.nxia.pattern.factory.simplefactory;

public class SimpleFactory {

    private static  volatile SimpleFactory simpleFactory;

    private   SimpleFactory(){

    }

    public static  SimpleFactory getInstance(){
        if(simpleFactory==null){
            synchronized (SimpleFactory.class){
                if(simpleFactory==null){
                    simpleFactory = new SimpleFactory();
                }
            }
        }
        return simpleFactory;
    }

    public Product createProduct(String type){
        Product product = null;
        if("牛奶".equals(type)){
             product = new Milk();
        }else if("面包".equals(type)){
             product = new Bread();
        }
        return  product;
    }


}
