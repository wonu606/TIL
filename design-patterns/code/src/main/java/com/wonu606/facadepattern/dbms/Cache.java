package com.wonu606.facadepattern.dbms;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private Map<String, Row> cache = new HashMap<>();

    public void put(Row row) {
        cache.put(row.getName(), row);
    }

    public Row get(String name) {
        return cache.get(name);
    }
}
