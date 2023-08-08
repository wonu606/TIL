package main.java.chapter01.step01;

import java.util.ArrayList;
import java.util.List;

public class TicketOfficeV1 {

    private Long amount;
    private List<TicketV1> tickets = new ArrayList<>();

    public TicketOfficeV1(Long amount, List<TicketV1> tickets) {
        this.amount = amount;
        this.tickets.addAll(tickets);
    }

    public TicketV1 getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
