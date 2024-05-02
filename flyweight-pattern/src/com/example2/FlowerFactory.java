package com.example2;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

    private static final Map<String, Flower> flowersCache = new HashMap<>();

    public static Flower createFlower(String flowerName) {
        return flowersCache.computeIfAbsent(flowerName, k -> new Flower(flowerName));
    }

}
