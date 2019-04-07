package com.gupao.nxia.pattern.decorator;

public class Test {

    public static void main(String[] args) {
        CarInterface car = new Car();
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        SwimCar swimCar = new SwimCar(car);
        swimCar.move();
    }
}
