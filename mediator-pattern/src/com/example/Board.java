package com.example;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Ticket> inProgressTickets = new ArrayList<>();
    private List<Ticket> doneTicket = new ArrayList<>();

    public List<Ticket> getDoneTicket() {
        return doneTicket;
    }
    public void addTicketToInProgressTickets(Ticket ticket){
        inProgressTickets.add(ticket);
        System.out.println("Ticket added to inProgressTicket");
    }
    public void addTicketToDoneTickets(Ticket ticket){
        doneTicket.add(ticket);
        System.out.println("Ticket added to doneTickets");
        inProgressTickets.remove(ticket);
        System.out.println("Ticket is removed from inProgressTickets");
    }
}












