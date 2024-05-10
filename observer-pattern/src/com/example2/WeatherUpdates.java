package com.example2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class WeatherUpdates  implements PropertyChangeListener {

    private final List<String> weatherUpdates = new ArrayList<>();

    public void printUpdates(){
        for (String weatherUpdate : weatherUpdates) {
            System.out.println(weatherUpdate);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        weatherUpdates.add((String)evt.getNewValue());
    }
}











