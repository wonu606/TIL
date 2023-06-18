package com.wonu606.facadepattern.dbms;

public class DbmsExample {

    public static void main(String[] args) {
//        Dbms dbms = new Dbms();
//        Cache cache = new Cache();

        String name = "Dorosh";

//        Row row = cache.get(name);
//        if (row == null) {
//            row = dbms.query(name);
//            if (row != null) {
//                cache.put(row);
//            }
//        }
//
//        if (row != null) {
//            Message message = new Message(row);
//            System.out.println(message.makeName());
//            System.out.println(message.makeBirthday());
//            System.out.println(message.makeEmail());
//        } else {
//            System.out.println(name + " is not exists.");
//        }

        Facade facade = new Facade();
        facade.run(name);
    }

}
