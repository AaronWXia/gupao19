package com.gupao.nxia.pattern.factory.factorymethod;

public class BreadFactory implements  ProductFactory {
    @Override
    public Product createProdcut() {
        return new Bread();
    }
}
