package com.wonu606.visitorpattern.visitor;


import com.wonu606.visitorpattern.visitable.Item;
import com.wonu606.visitorpattern.visitable.Unit;

public class SumVisitor implements Visitor {

    private int sum;

    public int getValue() {
        return sum;
    }

    @Override
    public void visit(Unit unit) {
        if (unit instanceof Item) {
            sum += ((Item) unit).getValue();
        } else {
            unit.accept(this);
        }
    }
}
