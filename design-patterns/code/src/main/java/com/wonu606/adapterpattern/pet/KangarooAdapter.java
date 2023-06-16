package com.wonu606.adapterpattern.pet;

public class KangarooAdapter extends Pet{
    private Kangaroo kangaroo;

    public KangarooAdapter(String name) {
        super(name);
    }

    public KangarooAdapter(Kangaroo kangaroo) {
        super(kangaroo.getName());

        this.kangaroo = kangaroo;
    }

    @Override
    public void sound() {
        kangaroo.sound();
    }
}
