package com.example3;

public class Strore {

    private static final VendingMachine VENDING_MACHINE  = new VendingMachine();


    public static void main(String[] args) {
        buySnack("ChocolateBar");
        buySnack("Chips");
        buySnack("Drink");
    }

    private static void buySnack(String snackType) {
        Snack snack = VENDING_MACHINE.getSnack(snackType);
        assert snack != null;
        System.out.format("One snack buyed for %s for ₹%d\n", snackType ,snack.getPrice());
    }
}































