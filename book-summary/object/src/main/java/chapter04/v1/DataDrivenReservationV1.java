package main.java.chapter04.v1;

import main.java.chapter02.Customer;
import main.java.chapter02.Money;

public class DataDrivenReservationV1 {

    private Customer customer;
    private DataDrivenScreeningV1 screening;
    private Money fee;
    private int audienceCount;

    public DataDrivenReservationV1(Customer customer, DataDrivenScreeningV1 screening, Money fee,
            int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DataDrivenScreeningV1 getScreening() {
        return screening;
    }

    public void setScreening(DataDrivenScreeningV1 screening) {
        this.screening = screening;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public int getAudienceCount() {
        return audienceCount;
    }

    public void setAudienceCount(int audienceCount) {
        this.audienceCount = audienceCount;
    }
}
