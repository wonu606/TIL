package com.wonu606.decoratorpattern.strings.decorator;

import com.wonu606.decoratorpattern.strings.Item.Item;

public class SideDecorator extends Decorator {

    private Character sideCharacter;

    public SideDecorator(Item item, Character sideCharacter) {
        super(item);
        this.sideCharacter = sideCharacter;
    }

    @Override
    public int getLinesCount() {
        return item.getLinesCount();
    }

    @Override
    public int getMaxLength() {
        return item.getMaxLength() + 2;
    }

    @Override
    public int getLength(int index) {
        return item.getLength(index) + 2;
    }

    @Override
    public String getString(int index) {
        return sideCharacter + item.getString(index) + sideCharacter;
    }
}
