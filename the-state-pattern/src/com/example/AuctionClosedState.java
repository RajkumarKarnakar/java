package com.example;

public class AuctionClosedState implements AuctionState{
    @Override
    public void startAuction(Auction auction) {
        auction.setState(new AuctionStartedState());

        System.out.println("Auction started");
    }

    @Override
    public void closeAuction(Auction auction) {
        System.out.println("Auction already closed");
    }

    @Override
    public void placeBis() {
        System.out.println("Bid not place because action is already closed");

    }
}











