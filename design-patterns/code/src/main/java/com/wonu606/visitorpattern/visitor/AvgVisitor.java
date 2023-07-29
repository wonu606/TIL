package com.wonu606.visitorpattern.visitor;


import com.wonu606.visitorpattern.visitable.Item;
import com.wonu606.visitorpattern.visitable.Unit;

public class AvgVisitor implements Visitor {

    private int sum = 0;
    private int count = 0;

    public int getValue() {
        return sum / count;
    }

    @Override
    public void visit(Unit unit) {
        if (unit instanceof Item) {
            sum += ((Item) unit).getValue();
            count++;
        } else {
            unit.accept(this);
        }
    }
}
