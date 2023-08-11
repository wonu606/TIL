package com.wonu606.builderpattern.text;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String build() {
        return builder.head()
                + builder.body()
                + builder.foot();
    }
}
