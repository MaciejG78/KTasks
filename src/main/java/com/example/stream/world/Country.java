package com.example.stream.world;

import java.math.BigDecimal;

public class Country {
    private String countryName;
    private BigDecimal population;

    public Country(String countryName, BigDecimal population) {
        this.countryName = countryName;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }
}
