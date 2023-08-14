package main.java.chapter02.discount.policy.v2;

import main.java.chapter02.Money;
import main.java.chapter02.Screening;
import main.java.chapter02.discount.condition.DiscountCondition;

public class PercentDiscountPolicyV2 extends DefaultDiscountPolicy {

    private double percent;

    public PercentDiscountPolicyV2(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
