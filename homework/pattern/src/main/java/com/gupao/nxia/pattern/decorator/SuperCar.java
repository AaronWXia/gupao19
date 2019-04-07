package com.gupao.nxia.pattern.decorator;

public class SuperCar implements CarInterface {

    private CarInterface car;

    public SuperCar(CarInterface car){
         this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
