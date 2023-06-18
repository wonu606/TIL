package com.wonu606.facadepattern.dbms;

import java.util.HashMap;
import java.util.Map;

public class Dbms {

    private Map<String, Row> db = new HashMap<>();

    public Dbms() {
        db.put("jane", new Row("Jane", "1990-02-14", "jane09@geosee.co.kr"));
        db.put("robert", new Row("Robert", "1979-11-05", "nice@google.com"));
        db.put("dorosh", new Row("Dorosh", "1985-08-21", "doshdo@nave.net"));
    }

    public Row query(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return db.get(name.toLowerCase());
    }
}
