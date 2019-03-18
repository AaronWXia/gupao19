package com.gupao.nxia.pattern.factory.simplefactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        SimpleFactory simpleFactory = SimpleFactory.getInstance();
        Product product = simpleFactory.createProduct("牛奶");
        System.out.println("product:"+product.getProductParam());
    }
}
