package com.example2;

public class RoomWithTable extends RoomDecorator{

    public RoomWithTable(Room room) {
        super(room);
    }

    @Override
    public void printFurniture() {
        super.printFurniture();
        System.out.println("Table");
    }
}
