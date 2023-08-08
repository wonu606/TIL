package main.java.chapter01.step03;

import main.java.chapter01.step01.TicketOfficeV1;

public class TicketSellerV3 {

    private TicketOfficeV3 ticketOffice;

    public TicketSellerV3(TicketOfficeV3 ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOfficeV3 getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(AudienceV3 audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
