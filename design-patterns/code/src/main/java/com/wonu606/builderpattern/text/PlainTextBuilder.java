package com.wonu606.builderpattern.text;

public class PlainTextBuilder extends Builder{

    public PlainTextBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "";
    }

    @Override
    public String body() {
        return "Name: " + data.getName() + "\n"
                + "Age: " + data.getAge() + "\n";
    }

    @Override
    public String foot() {
        return "";
    }
}
