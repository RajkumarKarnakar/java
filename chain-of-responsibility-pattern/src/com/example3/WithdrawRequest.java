package com.example3;

public class WithdrawRequest {

    private final Double amount;
    private final Currency currency;


    public WithdrawRequest(Double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public enum Currency {
        INR,
        USD,
        JPY
    }
}
