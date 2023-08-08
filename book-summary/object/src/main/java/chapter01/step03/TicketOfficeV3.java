package main.java.chapter01.step03;

import java.util.ArrayList;
import java.util.List;
import main.java.chapter01.step01.TicketV1;

public class TicketOfficeV3 {

    private Long amount;
    private List<TicketV1> tickets = new ArrayList<>();

    public TicketOfficeV3(Long amount, List<TicketV1> tickets) {
        this.amount = amount;
        this.tickets.addAll(tickets);
    }

    public void sellTicketTo(AudienceV3 audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private TicketV1 getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
