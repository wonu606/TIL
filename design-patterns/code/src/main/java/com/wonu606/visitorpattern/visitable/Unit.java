package com.wonu606.visitorpattern.visitable;


import com.wonu606.visitorpattern.visitor.Visitor;

public interface Unit {

    void accept(Visitor visitor);
}
