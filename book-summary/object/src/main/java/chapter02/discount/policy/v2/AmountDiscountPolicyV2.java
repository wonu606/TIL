package main.java.chapter02.discount.policy.v2;

import main.java.chapter02.Money;
import main.java.chapter02.Screening;
import main.java.chapter02.discount.condition.DiscountCondition;

public class AmountDiscountPolicyV2 extends DefaultDiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicyV2(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
