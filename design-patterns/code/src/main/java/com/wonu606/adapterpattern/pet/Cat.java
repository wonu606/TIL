package com.wonu606.adapterpattern.pet;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "냐옹");
    }
}
