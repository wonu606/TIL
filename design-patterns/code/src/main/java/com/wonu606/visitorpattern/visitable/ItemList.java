package com.wonu606.visitorpattern.visitable;


import com.wonu606.visitorpattern.visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

public class ItemList implements Unit {

    private final List<Unit> list = new ArrayList<>();

    public void add(Unit Unit) {
        list.add(Unit);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Unit Unit : list) {
            visitor.visit(Unit);
        }
    }
}
