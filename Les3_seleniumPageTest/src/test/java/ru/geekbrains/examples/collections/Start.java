package ru.geekbrains.examples.collections;

public class Start {

    public void main(String[] args) {
        CarModel carModel1 = new CarModel("vaz-2106");
        CarModel carModel2 = new CarModel("vaz-2106");
        CarModel carModel3 = null;
        CarModel carModel4 = null;

        System.out.println(carModel1.equals(carModel2));
        System.out.println(carModel1.hashCode());
        System.out.println(carModel2.hashCode());
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
    }

    class CarEngineType {
            private String type;

            public CarEngineType(String type) {
                this.type = type;
            }
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

//            CarModel carModel = (CarModel) o;
//
//            if (year != carModel.year) return false;
//            return model != null ? model.equals(carModel.model) : carModel.model == null;
        }
}