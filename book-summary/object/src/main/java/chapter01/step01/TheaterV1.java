package main.java.chapter01.step01;

public class TheaterV1 {

    private TicketSellerV1 ticketSeller;

    public TheaterV1(TicketSellerV1 ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(AudienceV1 audience) {
        if (audience.getBag().hasInvitation()) {
            TicketV1 ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            TicketV1 ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
