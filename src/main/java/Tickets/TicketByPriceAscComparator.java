package Tickets;

import java.util.Comparator;

public class TicketByPriceAscComparator implements Comparator<Ticket> {
    public int compare(Ticket o1, Ticket o2) {
        return o1.getFlightDuration() - o2.getFlightDuration();
    }


}