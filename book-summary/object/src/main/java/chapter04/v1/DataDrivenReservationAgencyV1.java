package main.java.chapter04.v1;

import main.java.chapter02.Customer;
import main.java.chapter02.Money;

public class DataDrivenReservationAgencyV1 {

    public DataDrivenReservationV1 reserve(DataDrivenScreeningV1 screening,
            Customer customer,
            int audienceCount) {
        DataDrivenMovieV1 movie = screening.getMovie();

        boolean discountable = false;
        for (DataDrivenDiscountConditionV1 condition : movie.getDiscountConditions()) {
            // 기간 할인 조건
            if (condition.getType() == DiscountConditionType.PERIOD) {
                discountable =
                        screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek())
                                &&
                                !condition.getStartTime()
                                        .isAfter(screening.getWhenScreened().toLocalTime()) &&
                                !condition.getEndTime()
                                        .isBefore(screening.getWhenScreened().toLocalTime());
            } else { // 순번 할인 조건
                discountable = condition.getSequence() == screening.getSequence();
            }

            if (discountable) {
                break;
            }
        }

        Money fee;
        if (discountable) {
            Money discountAmount = Money.ZERO;
            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT -> discountAmount = movie.getDiscountAmount();
                case PERCENT_DISCOUNT -> discountAmount = movie.getFee().times(movie.getDiscountPercent());
                case NONE_DISCOUNT -> discountAmount = Money.ZERO;
                default -> throw new IllegalStateException("Unexpected value: " + movie.getMovieType());
            }

            fee = movie.getFee().minus(discountAmount);
        } else {
            fee = movie.getFee();
        }

        return new DataDrivenReservationV1(customer, screening, fee, audienceCount);
    }
}
