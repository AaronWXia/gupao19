package com.gupao.nxia.pattern.prototype.deep;

public class Test {
    public static void main(String[] args) {
        Money  money = new SunWuKong();

        SunWuKong sunWuKong = (SunWuKong) money.clone(money);

    }
}
