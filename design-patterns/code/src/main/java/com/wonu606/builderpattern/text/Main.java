package com.wonu606.builderpattern.text;

public class Main {

    public static void main(String[] args) {
        Data data = new Data("Wonwoo", 28);

        Builder plainBuilder = new PlainTextBuilder(data);
        Director plainDirector = new Director(plainBuilder);
        String plainResult = plainDirector.build();

        Builder XMLBuilder = new XMLBuilder(data);
        Director XMLDirector = new Director(XMLBuilder);
        String XMLResult = XMLDirector.build();

        Builder JSONBuilder = new JSONBuilder(data);
        Director JSONDirector = new Director(JSONBuilder);
        String JSONResult = JSONDirector.build();

        System.out.println("plainResult::\n" + plainResult + "\n");
        System.out.println("XMLResult::\n" + XMLResult + "\n");
        System.out.println("JSONResult::\n" + JSONResult);
    }
}
