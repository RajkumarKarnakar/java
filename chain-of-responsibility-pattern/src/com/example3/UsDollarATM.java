package com.example3;

public class UsDollarATM extends ATM {


    public UsDollarATM(ATM nextATM) {
        super(nextATM);
    }

    @Override
    public void dispense(WithdrawRequest request) {
        System.out.println("im in usd dispense ");
        if(request.getCurrency()== WithdrawRequest.Currency.USD)
        System.out.format("dispense: $%.2f\n", request.getAmount());
        else if (nextATM != null) {
            System.out.println("from usd dispense to "+nextATM.toString());
            nextATM.dispense(request);
        }
    }

}
