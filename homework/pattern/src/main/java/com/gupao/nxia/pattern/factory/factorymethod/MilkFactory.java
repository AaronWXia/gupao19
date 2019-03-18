package com.gupao.nxia.pattern.factory.factorymethod;

public class MilkFactory implements  ProductFactory {


    @Override
    public Product createProdcut() {
        return new Milk();
    }
}
