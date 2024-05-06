package com.example3;

public class IndianRupeeATM extends ATM {


    public IndianRupeeATM(ATM nextATM) {
        super(nextATM);
    }

    @Override
    public void dispense(WithdrawRequest request) {
        System.out.println("im in indian rupee dispense ");
        if(request.getCurrency() == WithdrawRequest.Currency.INR)
        System.out.format("Dispensing : ₹%.2f\n", request.getAmount());
        else if (nextATM != null) {
            nextATM.dispense(request);
        }
    }
}




















