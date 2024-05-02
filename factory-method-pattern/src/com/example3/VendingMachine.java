package com.example3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    public static final Map<String, Supplier<Snack>> snacks = new HashMap<>();

    static {
        snacks.put("chocolatebar",ChocolateBar::new);
        snacks.put("chips", Chips::new);
        snacks.put("drink", Drink::new);
    }
    Snack getSnack(String snackName) {
        if(snacks.get(snackName.toLowerCase()) != null){
            return snacks.get(snackName.toLowerCase()).get();
        }
        else {
            throw new RuntimeException("No such snack: " + snackName);
        }
    }
}














