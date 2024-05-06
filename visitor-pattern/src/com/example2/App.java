package com.example2;

public class App {

    public static void main(String[] args) {
        var groupTicket = new GroupTicket();
        var ticket1 = new AdultTicket();
        var ticket2 = new AdultTicket();
        var ticket3 = new ChildTicket();
        groupTicket.addElement(ticket1);
        groupTicket.addElement(ticket2);
        groupTicket.addElement(ticket3);

        System.out.println("Total price: "+groupTicket.getPrice());

        System.out.println("-------------------------------");

        var  discountVisitor = new DiscountVisitor();
        groupTicket.accept(discountVisitor);

        System.out.println("Total price after discount: "+groupTicket.getPrice());

    }
}



















