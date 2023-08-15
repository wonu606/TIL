package main.java.chapter04.v2;

import java.time.DayOfWeek;
import java.time.LocalTime;
import main.java.chapter04.v1.DiscountConditionType;

public class DataDrivenDiscountConditionV2 {

    private DiscountConditionType type;

    private int sequence;

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public DataDrivenDiscountConditionV2(DiscountConditionType type, int sequence,
            DayOfWeek dayOfWeek,
            LocalTime startTime, LocalTime endTime) {
        this.type = type;
        this.sequence = sequence;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
        if (type != DiscountConditionType.PERIOD) {
            throw new IllegalArgumentException();
        }

        return this.dayOfWeek.equals(dayOfWeek) &&
                !this.startTime.isAfter(time) &&
                !this.endTime.isBefore(time);
    }

    public boolean isDiscountable(int sequence) {
        if (type != DiscountConditionType.SEQUENCE) {
            throw new IllegalArgumentException();
        }

        return this.sequence == sequence;
    }

    public DiscountConditionType getType() {
        return type;
    }
}
