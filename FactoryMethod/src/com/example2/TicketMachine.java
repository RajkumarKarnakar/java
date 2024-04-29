package com.example2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {

    private static final Map<String, Supplier<Ticket>> ticketMap = new HashMap<>();

    static {
        ticketMap.put("bus", BusTicket::new);
        ticketMap.put("train", TrainTicket::new);
    }

    Ticket createTicket(String ticketType) {
        if (ticketMap.get(ticketType.toLowerCase()) != null) {
            return ticketMap.get(ticketType.toLowerCase()).get();
        } else {
            throw new IllegalArgumentException("Ticket type " + ticketType + " not supported");
        }

    }
}











