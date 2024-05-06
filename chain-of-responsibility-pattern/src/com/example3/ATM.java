package com.example3;

public abstract class ATM {

    public ATM nextATM;
    public int test = 1;

    public ATM(ATM nextATM) {
        this.nextATM = nextATM;
    }

    public abstract void dispense(WithdrawRequest request);

}
