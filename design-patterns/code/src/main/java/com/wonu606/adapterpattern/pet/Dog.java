package com.wonu606.adapterpattern.pet;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "멍멍");
    }
}
