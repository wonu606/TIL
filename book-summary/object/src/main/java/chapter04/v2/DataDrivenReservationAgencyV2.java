package main.java.chapter04.v2;

import main.java.chapter02.Customer;
import main.java.chapter02.Money;
import main.java.chapter02.Reservation;

public class DataDrivenReservationAgencyV2 {

    public DataDrivenReservationV2 reserve(DataDrivenScreeningV2 screening, Customer customer,
            int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new DataDrivenReservationV2(customer, screening, fee, audienceCount);
    }
}
