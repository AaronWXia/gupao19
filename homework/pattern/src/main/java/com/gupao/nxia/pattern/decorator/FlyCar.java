package com.gupao.nxia.pattern.decorator;

public class FlyCar extends SuperCar {

    public FlyCar(CarInterface car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

}
