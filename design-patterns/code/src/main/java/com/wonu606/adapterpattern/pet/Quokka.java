package com.wonu606.adapterpattern.pet;

public class Quokka extends Kangaroo{

    public Quokka(String name) {
        super(name);
    }

    @Override
    public void jump() {
        System.out.println("폴짝");
    }

    @Override
    public void sound() {
        System.out.println(name + "헤헤~");
    }
}
