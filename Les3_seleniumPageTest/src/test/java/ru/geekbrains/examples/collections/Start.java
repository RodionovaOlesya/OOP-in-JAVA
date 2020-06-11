package ru.geekbrains.examples.collections;

public class Start {

    public static void main(String[] args) {
        CarModel carModel1 = new CarModel("vaz-2106");
        CarModel carModel2 = new CarModel("vaz-2106");
        CarModel carModel3 = null;
        CarEngineType carModel4 = new CarEngineType("V4");

        System.out.println(carModel1.equals(carModel2));
        System.out.println(carModel1.hashCode());
        System.out.println(carModel2.hashCode());

        System.out.println(carModel2.equals(carModel4));
        System.out.println(carModel1.equals(carModel3));
    }
}

class CarEngineType {
    private String type;

    public CarEngineType(String type) {
        this.type = type;
    }
}

class CarModel {
    private String model;
    private int year;

    public CarModel(String model) {
        this.model = model;
        year = 0;
    }

    public CarModel(String model, int year) {
        this.model = model;
        this.year = year;
    }

class CarEngineType {
    private String type;

    public CarEngineType(String type) {
        this.type = type;
    }
}

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CarModel carModel = (CarModel) o;

        if (year != carModel.year) return false;
        //return model != null ? model.equals(carModel.model) : carModel.model == null;
        if (carModel.model.equals((this.model))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + year + 2;
        return result;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}