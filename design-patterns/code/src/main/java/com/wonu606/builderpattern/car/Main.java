package com.wonu606.builderpattern.car;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("V7", true, "Black", true, true);

        Car car2 = new CarBuilder()
                .setEngine("V9")
                .setAirbag(false)
                .setColor("White")
                .setCameraSensor(true)
                .setAEB(false)
                .build();

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
    }
}
