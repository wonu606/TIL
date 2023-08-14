package main.java.chapter02.discount.policy.v2;

import main.java.chapter02.Money;
import main.java.chapter02.Screening;

public class NoneDiscountPolicyV2 implements DiscountPolicyV2 {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
