package Repository;

import Tickets.Ticket;

public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];

    // Метод добавления билетов
    public void addTicket(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    // Метод вывода всех сохраненных билетов
    public Ticket[] findAll() {
        return tickets;
    }

    // Метод удаления билета по ID
    public void removeById(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyToIndex = 0;
        for (Ticket product : tickets) {
            if (product.getTicketID() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        tickets = tmp;
    }


}

