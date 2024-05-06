package com.example2;

public class DiscountVisitor implements Visitor {
    @Override
    public void visit(AdultTicket adultTicket) {
        adultTicket.setPrice(10);
    }

    @Override
    public void visit(ChildTicket childTicket) {
        childTicket.setPrice(5);
    }

    @Override
    public void visit(GroupTicket groupTicket) {
        groupTicket.getElements().forEach(element -> {
            element.accept(this);
        });
    }
}














