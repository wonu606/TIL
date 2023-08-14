package main.java.chapter02.discount.condition;

import main.java.chapter02.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
