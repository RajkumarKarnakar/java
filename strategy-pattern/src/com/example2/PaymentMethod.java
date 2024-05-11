package com.example2;

public interface PaymentMethod {


    void checkout(int i);

    PaymentMethod card =
            (a) -> System.out.println("Payment made by card " + a);

    PaymentMethod bankTransfer =
            (a) -> System.out.println("Payment made by bank transfer " + a);

}
















