package main.java.chapter02.discount.policy.v2;

import main.java.chapter02.Money;
import main.java.chapter02.Screening;

public interface DiscountPolicyV2 {

    Money calculateDiscountAmount(Screening screening);
}
