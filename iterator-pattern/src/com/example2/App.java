package com.example2;

public class App {

    public static void main(String[] args) {
        var india = new Country("India");
        var poland = new Country("Poland");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var countryCollection = new CountryCollection(india,canada,poland,argentina);

        for(Country country : countryCollection){
            System.out.println(country.getName());
        }

    }
}
