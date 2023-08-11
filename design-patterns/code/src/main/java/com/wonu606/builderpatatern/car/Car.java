package com.wonu606.builderpatatern.car;

public class Car {

    private final String engine;
    private final boolean airbag;
    private final String color;
    private final boolean cameraSensor;
    private final boolean AEB;

    public Car(String engine, boolean airbag, String color, boolean cameraSensor, boolean AEB) {
        this.engine = engine;
        this.airbag = airbag;
        this.color = color;
        this.cameraSensor = cameraSensor;
        this.AEB = AEB;
    }

    @Override
    public String toString() {
        return "# CAR SPEC\n"
                + "engine: " + engine + "\n"
                + "airbag: " + airbag + "\n"
                + "color: " + color + "\n"
                + "cameraSensor: " + cameraSensor + "\n"
                + "AEB: " + AEB + "\n";
    }
}
