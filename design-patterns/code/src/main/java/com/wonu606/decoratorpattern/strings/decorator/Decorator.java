package com.wonu606.decoratorpattern.strings.decorator;

import com.wonu606.decoratorpattern.strings.Item.Item;

public abstract class Decorator extends Item {

    protected Item item;

    public Decorator(Item item) {
        this.item = item;
    }
}
