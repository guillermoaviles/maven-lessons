package com.ironhack.w2.d3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        Category category = Category.GOLD;
        System.out.println("Category: " + category + " Points: " + category.POINTS);

        Map<String, String> nationalLeaders = new HashMap<>();
        nationalLeaders.put("India", "Ram Nath Kovind");
        nationalLeaders.put("Japan", "Shinzo Abe");
        nationalLeaders.put("Ecuador", "Lenin Moreno");

        System.out.println(nationalLeaders);

        nationalLeaders.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
        });

        Map<String, Country> countryMap = new HashMap<>();

        Country india = new Country("India", "New Delhi", 1387297452, "Ram Nath Kovind");
        Country botswana = new Country("Botswana", "Gaborone", 2351627, "Mokgweetsi Masisi");
        Country japan = new Country("Japan", "Tokyo", 126476461, "Shinzō Abe");

        countryMap.put("India", india);
        countryMap.put("Japan", japan);
        countryMap.put("Botswana", botswana);

        System.out.println(countryMap);
        System.out.println(countryMap.get("Japan"));
        System.out.println(countryMap.get("Japan").getCapital());
    }
}
