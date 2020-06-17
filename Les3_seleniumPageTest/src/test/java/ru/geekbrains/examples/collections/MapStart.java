package ru.geekbrains.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapStart {

    public static void main(String[] args) {
        Map<CarModel, String> carMap = new HashMap<>();

        carMap.put(new CarModel("vaz"), "могло бы и лучше.");
        carMap.put(new CarModel("nissan"), "неплохо.");
        carMap.put(new CarModel("audi"), "чудо расчудесное!");

        Map<String, String> colourSeasons = new HashMap<>();
        colourSeasons.put("winter", "white");
        colourSeasons.put("spring", "green");
        colourSeasons.put("summer", "bright");
        colourSeasons.put("autumn", "yellow");

        System.out.println(colourSeasons);
    }
}
