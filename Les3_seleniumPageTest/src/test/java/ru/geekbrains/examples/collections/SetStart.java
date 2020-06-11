package ru.geekbrains.examples.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetStart {

    public static void main(String[] args) {

        Set<CarModel> carModelSet = new HashSet<>();
        Set<CarModel> carModelSet1 = new HashSet<>();

        CarModel[] carModels = {new CarModel("mercedes"), new CarModel("audi"), new CarModel("reno")};

        carModelSet.addAll(Arrays.asList(carModels));

        carModelSet1.add(new CarModel("vaz"));
        carModelSet1.add(new CarModel("nissan"));
        carModelSet1.add(new CarModel("bmw"));

        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("volga"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("kia"));
        carModelSet.add(new CarModel("nissan"));

        //carModelSet.retainAll(carModelSet1);

        for (CarModel carModel: carModelSet) {
            System.out.println(carModel);
        }

    }
}
