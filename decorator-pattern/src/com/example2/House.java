package com.example2;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println("-------------------");

        var roomWithCouch = new RoomWithCouch(room);

        roomWithCouch.printFurniture();

        System.out.println("-------------------");

        var roomWithTable = new RoomWithTable(roomWithCouch);
        roomWithTable.printFurniture();
    }
}
