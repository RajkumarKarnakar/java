package com.example2;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.payForItems(PaymentMethod.card,1225);
        checkoutPage.payForItems(PaymentMethod.card,5245);
        checkoutPage.payForItems(PaymentMethod.bankTransfer,1888);

    }
}
