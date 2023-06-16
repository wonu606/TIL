package com.wonu606.adapterpattern.pet;

public abstract class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public abstract void sound();
}
