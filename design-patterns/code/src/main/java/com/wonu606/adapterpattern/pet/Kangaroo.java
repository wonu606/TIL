package com.wonu606.adapterpattern.pet;

public abstract class Kangaroo {
    protected String name;

    public Kangaroo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void jump();
    public abstract void sound();
}
