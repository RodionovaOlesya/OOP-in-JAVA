package ru.geekbrains.examples.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStart {
    public static void main(String[] args) {
        List<CarModel> carModelList = new ArrayList<>();

        CarModel m1 = new CarModel("1234", 2015);

        carModelList.add(new CarModel("123", 2018));
        carModelList.add(m1);
        carModelList.add(new CarModel("1235", 2006));
        carModelList.add(new CarModel("1231"));
        carModelList.add(new CarModel("1243"));

        CarModel[] carModelsArray = { new CarModel("123"), new CarModel("1234",1996), new CarModel("bmw", 2018)};

        System.out.println("Есть ли carModel 1234? " + carModelList.contains(m1));
        System.out.println("индекс carModel 1234: " + carModelList.indexOf(m1));
        System.out.println("Удаляем carModel 1234 " + carModelList.remove(m1));
        System.out.println("Есть ли carModel 1234? " + carModelList.contains(m1));

//        for (CarModel model: carModelList) {
//            System.out.println(model);
//        }

        Iterator<CarModel> iterator = carModelList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(carModelList.size());
    }
}
