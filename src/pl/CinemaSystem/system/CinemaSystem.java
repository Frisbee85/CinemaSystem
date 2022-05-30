package pl.CinemaSystem.system;

import pl.CinemaSystem.model.Client;
import pl.CinemaSystem.model.MovieShow;
import pl.CinemaSystem.model.Ticket;

public class CinemaSystem {
    public static void main(String[] args) {

        MovieShow movie1 = new MovieShow("Hannibal", "horror", 128, 16, 72, 72);

        Client client1 = new Client("Jan", "Kowalski", 18);
        int ticketCount = 0;
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);

        Client client2 = new Client("Anna", "Jopek", 19);
        Ticket ticket2 = ticketSystem.createTicket(movie1, client2);

        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
    }
}

