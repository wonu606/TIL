package main.java.chapter02;

import java.time.Duration;
import main.java.chapter02.discount.policy.v1.DisCountPolicyV1;

public class Movie {

    private String title;
    private Duration runningTime;

    private Money fee;

    private DisCountPolicyV1 disCountPolicyV1;

    public Movie(String title, Duration runningTime, Money fee, DisCountPolicyV1 disCountPolicyV1) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.disCountPolicyV1 = disCountPolicyV1;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(disCountPolicyV1.calculateDiscountAmount(screening));
    }
}
