package com.gupao.nxia.pattern.factory.abstractfactory;

import com.gupao.nxia.pattern.factory.factorymethod.Product;

/**
 * 工厂方法->工厂接口,产品方法
 */
public interface ProductFactory {

    public Product createProdcut();
}
