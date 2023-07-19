package com.ironhack.w2.d3;

public class Country {
    private String countryName;
    private String capital;
    private int population;
    private String leader;

    public Country(String countryName, String capital, int population, String leader) {
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
        this.leader = leader;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
