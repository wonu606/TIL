package com.wonu606.visitorpattern.visitable;

import com.wonu606.visitorpattern.visitor.Visitor;

public class Item implements Unit {

    private final int value;

    public Item(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
