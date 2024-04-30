package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
    private static final Map<String, Supplier<BikeFactory>> bikeTypes
            = new HashMap<>();

    static {
        bikeTypes.put("ROAD",RoadBikeFactory::new);
        bikeTypes.put("MOUNTAIN",MountainBikeFactory::new);
    }

    public static BikeFactory createBike(String type) {
        if (bikeTypes.get(type) != null){
            return bikeTypes.get(type).get();
        }else {
            throw new IllegalArgumentException("Unknown bike type: " + type);
        }
    }
}
































