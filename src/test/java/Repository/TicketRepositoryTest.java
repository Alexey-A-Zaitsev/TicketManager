package Repository;

import Tickets.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryTest {

    TicketRepository repo = new TicketRepository();

    Ticket ticket1 = new Ticket(1, 391, "VKO", "KZN", 100);
    Ticket ticket2 = new Ticket(2, 621, "AER", "NSK", 374);
    Ticket ticket3 = new Ticket(3, 462, "KZN", "DME", 95);
    Ticket ticket4 = new Ticket(4, 678, "KRR", "LED", 121);
    Ticket ticket5 = new Ticket(5, 657, "DME", "KZN", 111);
    Ticket ticket6 = new Ticket(6, 733, "DME", "KZN", 475);
    Ticket ticket7 = new Ticket(7, 412, "SGC", "OBV", 250);
    Ticket ticket8 = new Ticket(8, 312, "VKO", "KZN", 100);
    Ticket ticket9 = new Ticket(9, 534, "DME", "NUX", 100);
    Ticket ticket10 = new Ticket(10, 678, "KRR", "LED", 100);


    @Test
    void shouldAddOneTicket() {
        repo.addTicket(ticket1);

        Ticket[] expected = {ticket1};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddFewTicket() {
        repo.addTicket(ticket1);
        repo.addTicket(ticket4);
        repo.addTicket(ticket2);
        repo.addTicket(ticket8);


        Ticket[] expected = {ticket1, ticket4, ticket2, ticket8};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveOneTicketByID() {
        repo.addTicket(ticket4);
        repo.addTicket(ticket5);
        repo.addTicket(ticket6);
        repo.addTicket(ticket7);

        repo.removeById(6);

        Ticket[] expected = {ticket4, ticket5, ticket7};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void shouldRemoveFewTicketByID() {
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);
        repo.addTicket(ticket5);
        repo.addTicket(ticket6);
        repo.addTicket(ticket7);
        repo.addTicket(ticket8);
        repo.addTicket(ticket9);
        repo.addTicket(ticket10);

        repo.removeById(6);
        repo.removeById(10);
        repo.removeById(3);


        Ticket[] expected = {ticket4, ticket5, ticket7, ticket8, ticket9};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

}