package com.wonu606.visitorpattern.visitor;


import com.wonu606.visitorpattern.visitable.Unit;

public interface Visitor {

    int getValue();

    void visit(Unit unit);
}
