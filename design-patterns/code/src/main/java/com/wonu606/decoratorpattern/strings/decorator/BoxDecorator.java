package com.wonu606.decoratorpattern.strings.decorator;

import com.wonu606.decoratorpattern.strings.Item.Item;

public class BoxDecorator extends Decorator {

    public BoxDecorator(Item item) {
        super(item);
    }

    @Override
    public int getLinesCount() {
        return item.getLinesCount() + 2;
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
        if (isBorderIndex(index)) {
            return makeBorderString();
        }
        int stringIndex = index - 1;
        return '|' + item.getString(stringIndex)
                + makeSpaceString(item.getMaxLength() - item.getLength(stringIndex))
                + '|';
    }

    private String makeBorderString() {
        return '+' + "-".repeat(item.getMaxLength()) + '+';
    }

    private String makeSpaceString(int length) {
        return " ".repeat(length);
    }

    private boolean isBorderIndex(int index) {
        if (index == 0 || index == getLinesCount() - 1) {
            return true;
        }
        return false;
    }
}
