package main.java.chapter01.step03;

import main.java.chapter01.step01.InvitationV1;
import main.java.chapter01.step01.TicketV1;

public class BagV3 {
    private Long amount;
    private InvitationV1 invitation;
    private TicketV1 ticket;

    public BagV3(Long amount) {
        this.amount = amount;
    }

    public Long hold(TicketV1 ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(TicketV1 ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long fee) {
        this.amount -= amount;
    }
}
