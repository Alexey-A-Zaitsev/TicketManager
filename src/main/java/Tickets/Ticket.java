package Tickets;

public class Ticket implements Comparable<Ticket> {
    private int ticketID;
    private int price;
    private String from;
    private String to;
    private int flightDuration;

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.getPrice()) {
            return -1;
        } else if (this.price > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }

    public Ticket(int ticketID, int price, String from, String to, int flightDuration) {
        this.ticketID = ticketID;
        this.price = price;
        this.from = from;
        this.to = to;
        this.flightDuration = flightDuration;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }
}
