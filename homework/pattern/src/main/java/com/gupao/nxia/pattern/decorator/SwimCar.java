package com.gupao.nxia.pattern.decorator;

public class SwimCar extends SuperCar {
    public SwimCar(CarInterface car) {
        super(car);
    }

    public void swim(){
        System.out.println("水里游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
