package Tickets;

import Repository.TicketRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

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

    @BeforeEach
    public void beforeAllTests() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
    }

    @Test
    public void shouldFindAndSortTickets() {

        Ticket[] expected = {ticket8, ticket1};
        Ticket[] actual = manager.searchBy("VKO", "KZN");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindAndSortTickets() {

        Ticket[] expected = new Ticket[0];
        Ticket[] actual = manager.searchBy("LED", "KRR");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAndSortTicketsIfTheSecondPriceIsGreaterThanTheFirst() {

        Ticket[] expected = {ticket5, ticket6};
        Ticket[] actual = manager.searchBy("DME", "KZN");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAndSortTicketsIfPricesAreEqual() {

        Ticket[] expected = {ticket4, ticket10};
        Ticket[] actual = manager.searchBy("KRR", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }
}