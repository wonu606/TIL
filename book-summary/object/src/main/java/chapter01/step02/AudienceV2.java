package main.java.chapter01.step02;

import main.java.chapter01.step01.BagV1;
import main.java.chapter01.step01.TicketV1;

public class AudienceV2 {

    private BagV1 bag;

    public AudienceV2(BagV1 bag) {
        this.bag = bag;
    }

    public BagV1 getBag() {
        return bag;
    }

    public Long buy(TicketV1 ticket) {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
