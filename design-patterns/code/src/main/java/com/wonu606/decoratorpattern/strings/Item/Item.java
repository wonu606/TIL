package com.wonu606.decoratorpattern.strings.Item;

public abstract class Item {

    public abstract int getLinesCount();

    public abstract int getMaxLength();

    public abstract int getLength(int index);

    public abstract String getString(int index);

    public void print() {
        int linesCount = getLinesCount();
        for (int i = 0; i < linesCount; i++) {
            String string = getString(i);
            System.out.println(string);
        }
    }
}
