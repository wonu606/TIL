package com.wonu606.decoratorpattern.strings;

import com.wonu606.decoratorpattern.strings.Item.Item;
import com.wonu606.decoratorpattern.strings.Item.Strings;
import com.wonu606.decoratorpattern.strings.decorator.BoxDecorator;
import com.wonu606.decoratorpattern.strings.decorator.LineNumberDecorator;
import com.wonu606.decoratorpattern.strings.decorator.SideDecorator;

public class StringsExample {

    public static void main(String[] args) {
        Strings strings = new Strings();

        strings.add("Hello~");
        strings.add("My Name is Yoo Won-woo");
        strings.add("I am a Student");
        strings.add("Design-Pattern is powerful tool.");
        strings.print();

        Item decorator = new SideDecorator(strings, '\"');
        decorator = new LineNumberDecorator(decorator);
        decorator = new BoxDecorator(decorator);

        decorator.print();
    }
}
