package com.wonu606.builderpatatern.text;

import javax.xml.namespace.QName;

public class Data {

    private final String name;
    private final int age;

    public Data(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
