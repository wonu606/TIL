package main.java.chapter01.step03;

import main.java.chapter01.step01.BagV1;
import main.java.chapter01.step01.TicketV1;

public class AudienceV3 {

    private BagV3 bag;

    public AudienceV3(BagV3 bag) {
        this.bag = bag;
    }

    public BagV3 getBag() {
        return bag;
    }

    public Long buy(TicketV1 ticket) {
        return bag.hold(ticket);
    }
}
