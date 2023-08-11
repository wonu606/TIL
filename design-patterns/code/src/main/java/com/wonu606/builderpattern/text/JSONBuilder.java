package com.wonu606.builderpatatern.text;

public class JSONBuilder extends Builder{

    public JSONBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "{\n";
    }

    @Override
    public String body() {
        return "\"Name\": \"" + data.getName() + "\"\n"
                + "\"Age\": \"" + data.getAge() + "\"\n";
    }

    @Override
    public String foot() {
        return "}\n";
    }
}
