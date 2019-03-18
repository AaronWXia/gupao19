package com.gupao.nxia.pattern.factory.abstractfactory;


/**
 * 当前产品有2个变化维护的时候, 同类产品版本不同,
 *
 *
 *
 *   4.0
 *   3.0
 *   2.0
 *   1.0   xxx    xxxx
 *         牛奶    面包    三明治   热狗
 */
public class CompanyImpl extends VersionOneProduct {
    @Override
    public Milk getMilk() {
        return (Milk) new MilkFactory("1.0").createProdcut();
    }

    @Override
    public Bread getBread() {
        return (Bread) new BreadFactory().createProdcut();
    }
}
