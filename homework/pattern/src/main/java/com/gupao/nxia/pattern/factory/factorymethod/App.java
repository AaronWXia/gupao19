package com.gupao.nxia.pattern.factory.factorymethod;


/**
 * Hello world!
 *
 */
public class App {


    public static void main( String[] args ) {
        ProductFactory productFactory = new MilkFactory();
        Product milk = productFactory.createProdcut();
        System.out.println("milk:-->"+milk.getProductParam());
    }

}
