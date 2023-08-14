package main.java.chapter02.discount.policy.v1;

import main.java.chapter02.Money;
import main.java.chapter02.Screening;
import main.java.chapter02.discount.condition.DiscountCondition;

public class AmountDiscountPolicyV1 extends DisCountPolicyV1 {

    private Money discountAmount;

    public AmountDiscountPolicyV1(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
