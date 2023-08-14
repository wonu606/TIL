package main.java.chapter02.discount.policy.v1;

import main.java.chapter02.Money;
import main.java.chapter02.Screening;
import main.java.chapter02.discount.condition.DiscountCondition;

public class PercentDiscountPolicyV1 extends DisCountPolicyV1 {

    private double percent;

    public PercentDiscountPolicyV1(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
