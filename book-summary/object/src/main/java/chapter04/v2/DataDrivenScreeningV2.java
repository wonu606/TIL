package main.java.chapter04.v2;

import java.time.LocalDateTime;
import main.java.chapter02.Money;
import main.java.chapter04.v1.DataDrivenMovieV1;

public class DataDrivenScreeningV2 {

    private DataDrivenMovieV2 movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public DataDrivenScreeningV2(DataDrivenMovieV2 movie, int sequence,
            LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Money calculateFee(int audienceCount) {
        switch (movie.getMovieType()) {
            case AMOUNT_DISCOUNT -> {
                if (movie.isDiscountable(whenScreened, sequence)) {
                    return movie.calculateAmountDiscountedFee().times(audienceCount);
                }
            }
            case PERCENT_DISCOUNT -> {
                if (movie.isDiscountable(whenScreened, sequence)) {
                    return movie.calculatePercentDiscountedFee().times(audienceCount);
                }
            }
            case NONE_DISCOUNT -> {
                return movie.calculateNoneDiscountedFee().times(audienceCount);
            }
            default -> throw new IllegalStateException("Unexpected value: " + movie.getMovieType());
        }

        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
