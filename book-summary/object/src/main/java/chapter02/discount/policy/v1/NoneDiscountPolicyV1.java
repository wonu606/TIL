package main.java.chapter02.discount.policy.v1;

import main.java.chapter02.Money;
import main.java.chapter02.Screening;

public class NoneDiscountPolicyV1 extends DisCountPolicyV1 {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
