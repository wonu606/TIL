package main.java.chapter02.discount.policy.v1;

import java.util.ArrayList;
import java.util.List;
import main.java.chapter02.Money;
import main.java.chapter02.Screening;
import main.java.chapter02.discount.condition.DiscountCondition;

public abstract class DisCountPolicyV1 {

    private final List<DiscountCondition> conditions = new ArrayList<>();

    public DisCountPolicyV1(DiscountCondition... conditions) {
        this.conditions.addAll(List.of(conditions));
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
