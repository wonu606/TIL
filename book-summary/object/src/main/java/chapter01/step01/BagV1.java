package main.java.chapter01.step01;

public class BagV1 {

    private Long amount;
    private InvitationV1 invitation;
    private TicketV1 ticket;

    public BagV1(Long amount) {
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(TicketV1 ticketV1) {
        this.ticket = ticketV1;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
