package com.gupao.nxia.pattern.decorator;

public class Car implements CarInterface {
    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }

}
