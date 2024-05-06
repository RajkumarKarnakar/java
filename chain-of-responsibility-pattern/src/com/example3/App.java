package com.example3;

public class App {

    public static void main(String[] args) {

        var request = new WithdrawRequest(100D, WithdrawRequest.Currency.INR);
        var request1 = new WithdrawRequest(100D, WithdrawRequest.Currency.USD);
        var request2 = new WithdrawRequest(200D, WithdrawRequest.Currency.JPY);

        var atm = buildChain();
        atm.dispense(request2);

    }
    private static ATM buildChain(){
        var indianRupeeATM = new IndianRupeeATM(null);
        var jpyATM = new YenATM(indianRupeeATM);
        return new UsDollarATM(jpyATM);
    }
}



















