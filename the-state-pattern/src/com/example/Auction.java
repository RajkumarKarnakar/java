package com.example;

public class Auction {
    private AuctionState state;

    public Auction() {
        state = new AuctionClosedState();
    }

    public void startAuction(){
       state.startAuction(this);
    }

    public void closeAuction(){
       state.closeAuction(this);
    }

    public void placeBid(){
        state.placeBis();
    }

    public void setState(AuctionState state) {
        this.state = state;
    }
}
