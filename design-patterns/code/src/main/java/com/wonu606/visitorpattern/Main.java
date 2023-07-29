package com.wonu606.visitorpattern;

import com.wonu606.visitorpattern.visitable.Item;
import com.wonu606.visitorpattern.visitable.ItemList;
import com.wonu606.visitorpattern.visitor.AvgVisitor;
import com.wonu606.visitorpattern.visitor.SumVisitor;
import com.wonu606.visitorpattern.visitor.Visitor;

public class Main {

    public static void main(String[] args) {
        ItemList list = new ItemList();
        list.add(new Item(10));
        list.add(new Item(20));
        list.add(new Item(30));

        Visitor avgVisitor1 = new AvgVisitor();
        list.accept(avgVisitor1);
        System.out.println("avgVisitor1.getValue() = " + avgVisitor1.getValue());

        SumVisitor sumVisitor1 = new SumVisitor();
        list.accept(sumVisitor1);
        System.out.println("sumVisitor1 = " + sumVisitor1.getValue());

        list.add(new Item(40));

        Visitor avgVisitor2 = new AvgVisitor();
        list.accept(avgVisitor2);
        System.out.println("avgVisitor1.getValue() = " + avgVisitor2.getValue());

        SumVisitor sumVisitor2 = new SumVisitor();
        list.accept(sumVisitor2);
        System.out.println("sumVisitor1 = " + sumVisitor2.getValue());
    }
}
