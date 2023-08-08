package main.java.chapter01.step02;

import main.java.chapter01.step01.TicketOfficeV1;

public class TicketSellerV2 {

    private TicketOfficeV1 ticketOffice;

    public TicketSellerV2(TicketOfficeV1 ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOfficeV1 getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(AudienceV2 audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
