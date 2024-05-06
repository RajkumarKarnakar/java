package com.example3;

public class YenATM extends ATM {

    public YenATM(ATM nextATM) {
        super(nextATM);
    }

    @Override
    public void dispense(WithdrawRequest request) {
        System.out.println("im in jpy dispense");
        if(request.getCurrency()== WithdrawRequest.Currency.JPY)
            System.out.format("Dispense: ¥%.2f",request.getAmount());
        else if (nextATM != null) {
            System.out.println(test);
            nextATM.dispense(request);
        }
    }
}














