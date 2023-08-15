package main.java.chapter04.v2;

import main.java.chapter02.Customer;
import main.java.chapter02.Money;
import main.java.chapter04.v1.DataDrivenScreeningV1;

public class DataDrivenReservationV2 {

    private Customer customer;
    private DataDrivenScreeningV2 screening;
    private Money fee;
    private int audienceCount;

    public DataDrivenReservationV2(Customer customer, DataDrivenScreeningV2 screening, Money fee,
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

    public DataDrivenScreeningV2 getScreening() {
        return screening;
    }

    public void setScreening(DataDrivenScreeningV2 screening) {
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
