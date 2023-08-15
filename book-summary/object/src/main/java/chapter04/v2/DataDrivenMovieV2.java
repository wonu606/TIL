package main.java.chapter04.v2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import main.java.chapter02.Money;
import main.java.chapter04.v1.DataDrivenDiscountConditionV1;
import main.java.chapter04.v1.DiscountConditionType;
import main.java.chapter04.v1.MovieType;

public class DataDrivenMovieV2 {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DataDrivenDiscountConditionV2> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public DataDrivenMovieV2(String title, Duration runningTime, Money fee,
            List<DataDrivenDiscountConditionV2> discountConditions, MovieType movieType,
            Money discountAmount, double discountPercent) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountConditions = discountConditions;
        this.movieType = movieType;
        this.discountAmount = discountAmount;
        this.discountPercent = discountPercent;
    }

    public boolean isDiscountable(LocalDateTime whenScreened, int sequence) {
        for (DataDrivenDiscountConditionV2 condition : discountConditions) {
            if (condition.getType() == DiscountConditionType.PERIOD) {
                if (condition.isDiscountable(whenScreened.getDayOfWeek(),
                        whenScreened.toLocalTime())) {
                    return true;
                }
            } else {
                if (condition.isDiscountable(sequence)) {
                    return true;
                }
            }
        }

        return false;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public Money calculateAmountDiscountedFee() {
        if (movieType != MovieType.AMOUNT_DISCOUNT) {
            throw new IllegalArgumentException();
        }

        return fee.minus(discountAmount);
    }

    public Money calculatePercentDiscountedFee() {
        if (movieType != MovieType.PERCENT_DISCOUNT) {
            throw new IllegalArgumentException();
        }

        return fee.minus(fee.times(discountPercent));
    }

    public Money calculateNoneDiscountedFee() {
        if (movieType != MovieType.NONE_DISCOUNT) {
            throw new IllegalArgumentException();
        }

        return fee;
    }
}
