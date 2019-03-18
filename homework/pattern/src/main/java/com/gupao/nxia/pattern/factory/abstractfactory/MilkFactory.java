package com.gupao.nxia.pattern.factory.abstractfactory;

import com.gupao.nxia.pattern.factory.factorymethod.Milk;
import com.gupao.nxia.pattern.factory.factorymethod.Product;

public class MilkFactory implements ProductFactory {

    private String version;

    public String  getVersion(){
        return this.version;
    }

    public  MilkFactory(String version){
        this.version = version;
    }

    @Override
    public Product createProdcut() {
        return new Milk();
    }
}
