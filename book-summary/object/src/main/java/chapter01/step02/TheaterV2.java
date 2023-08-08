package main.java.chapter01.step02;

public class TheaterV2 {

    private TicketSellerV2 ticketSeller;

    public TheaterV2(TicketSellerV2 ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(AudienceV2 audience) {
        ticketSeller.sellTo(audience);
    }
}
