package com.wonu606.builderpattern.text;

public class XMLBuilder extends Builder{

    public XMLBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?><DATA>\n";
    }

    @Override
    public String body() {
        return "<NAME>\n\t" + data.getName() + "\n</NAME>\n"
                + "<AGE>\n\t" + data.getAge() + "\n</AGE>\n";
    }

    @Override
    public String foot() {
        return "</DATA>";
    }
}
