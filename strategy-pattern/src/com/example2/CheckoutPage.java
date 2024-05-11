package com.example2;

public class CheckoutPage {

   public void payForItems(PaymentMethod paymentMethod,int number){
       paymentMethod.checkout(number);
   }
}
