package com.example2;

public abstract class RoomDecorator implements Room{

    private final Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public void printFurniture() {
        room.printFurniture();
    }
}
