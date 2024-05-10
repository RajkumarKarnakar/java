package com.example2;

public class Item {

    private int price;
    private ItemState itemState = new ItemState(price);

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(int price) {
        this.price = price;
    }

    public void save(){
        itemState.setState(price);
    }

    public void undo(){
        price = itemState.getState();
    }
}
