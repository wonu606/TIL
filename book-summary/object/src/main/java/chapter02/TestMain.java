package main.java.chapter02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import main.java.chapter02.discount.condition.PeriodCondition;
import main.java.chapter02.discount.condition.SequenceCondition;
import main.java.chapter02.discount.policy.v1.AmountDiscountPolicyV1;
import main.java.chapter02.discount.policy.v1.NoneDiscountPolicyV1;
import main.java.chapter02.discount.policy.v1.PercentDiscountPolicyV1;

public class TestMain {

    public static void main(String[] args) {
        Movie avatar = new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicyV1(Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0),
                                LocalTime.of(11, 59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0),
                                LocalTime.of(20, 59))
                )
        );

        Movie titanic = new Movie("타이타닉",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new PercentDiscountPolicyV1(0.1,
                        new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0),
                                LocalTime.of(16, 59)),
                        new SequenceCondition(2),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0),
                                LocalTime.of(23, 59))
                )
        );

        Movie startWars = new Movie("스타워즈",
                Duration.ofMinutes(210),
                Money.wons(10000),
                new NoneDiscountPolicyV1()
        );
    }
}
