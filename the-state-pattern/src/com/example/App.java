package com.example;

public class App {

    public static void main(String[] args) {
        var auction = new Auction();
        auction.startAuction();
        auction.placeBid();
        System.out.println("-----------------");
        auction.startAuction();
        System.out.println("-----------------");
        auction.closeAuction();
        auction.placeBid();
        System.out.println("-----------------");
        auction.closeAuction();
    }
}
