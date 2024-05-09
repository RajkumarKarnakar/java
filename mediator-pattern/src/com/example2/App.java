package com.example2;

public class App {

    public static void main(String[] args) {
/*

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();
        System.out.println("-------------------");
        trafficLight.changeToAmber();
        System.out.println("-------------------");
        trafficLight.changeToGreen(pedestrianCrossingLight);
        System.out.println("-------------------");
        trafficLight.changeToAmber();
        System.out.println("-------------------");
        trafficLight.changeToRed(pedestrianCrossingLight);

*/
        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();
        var mediator = new Mediator(pedestrianCrossingLight,trafficLight);

        mediator.changeTrafficLightToAmber();
        System.out.println("-------------------");
        mediator.changeTrafficLightToRed();
        System.out.println("-------------------");
        mediator.changeTrafficLightToAmber();
        System.out.println("-------------------");
        mediator.changeTrafficLightToGreen();

    }
}











