package main.java.chapter04.v1;

import java.time.Duration;
import java.util.List;
import main.java.chapter02.Money;

public class DataDrivenMovieV1 {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DataDrivenDiscountConditionV1> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Duration runningTime) {
        this.runningTime = runningTime;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public List<DataDrivenDiscountConditionV1> getDiscountConditions() {
        return discountConditions;
    }

    public void setDiscountConditions(
            List<DataDrivenDiscountConditionV1> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
