package com.example2;

public interface Visitor {

    void visit(AdultTicket adultTicket);
    void visit(ChildTicket childTicket);
    void visit(GroupTicket groupTicket);
}
