package pl.CinemaSystem.system;

import pl.CinemaSystem.model.Client;
import pl.CinemaSystem.model.MovieShow;
import pl.CinemaSystem.model.Ticket;

public class TicketSystem {
    Ticket createTicket(MovieShow movieShow, Client client) {
        if (movieShow.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movieShow.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
            movieShow.decreeFreeSeatsNumber();
            return new Ticket(ticketId, movieShow, client);
        }
    }
}