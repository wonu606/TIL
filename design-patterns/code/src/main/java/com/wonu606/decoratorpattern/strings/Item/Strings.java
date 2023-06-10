package com.wonu606.decoratorpattern.strings.Item;

import java.util.ArrayList;
import java.util.List;

public class Strings extends Item {

    private List<String> strings = new ArrayList<>();

    public void add(String string) {
        strings.add(string);
    }

    @Override
    public int getLinesCount() {
        return strings.size();
    }

    @Override
    public int getMaxLength() {
        int maxLength = 0;

        for (String string : strings) {
            int stringLength = string.length();
            maxLength = Math.max(maxLength, stringLength);
        }
        return maxLength;
    }

    @Override
    public int getLength(int index) {
        return getString(index).length();
    }

    @Override
    public String getString(int index) {
        return strings.get(index);
    }
}
