package com.example2;

public interface TicketElement {

    int getPrice();

    void accept(Visitor visitor);

}
