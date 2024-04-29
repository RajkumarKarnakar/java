package com.example2;

public class TicketOffice {
    private static final TicketMachine ticketMachine = new TicketMachine();

    public static void main(String[] args) {
        buyATicket("BuS");
        buyATicket("Train");
        buyATicket("car");
    }

    private static void buyATicket(String type) {
        var ticket = ticketMachine.createTicket(type);
        System.out.format("One %s ticket is purchased. the price is ₹%d",type.toUpperCase(),ticket.getPrice());
        System.out.println();
    }
}


















