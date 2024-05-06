package com.example2;

import java.util.ArrayList;
import java.util.List;

public class GroupTicket implements TicketElement{

    private final List<TicketElement> elements = new ArrayList<>();

    @Override
    public int getPrice() {
        return elements.stream().mapToInt(TicketElement::getPrice).sum();
    }

    public void addElement(TicketElement element) {
        elements.add(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<TicketElement> getElements() {
        return elements;
    }
}




















