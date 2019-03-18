package com.gupao.nxia.pattern.factory.abstractfactory;

import com.gupao.nxia.pattern.factory.factorymethod.Bread;
import com.gupao.nxia.pattern.factory.factorymethod.Product;

public class BreadFactory implements ProductFactory {
    @Override
    public Product createProdcut() {
        return new Bread();
    }
}
