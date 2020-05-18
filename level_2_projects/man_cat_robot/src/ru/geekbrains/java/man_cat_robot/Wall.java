package ru.geekbrains.java.man_cat_robot;

public class Wall implements Barrier {
    public int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void showInfo() {
        System.out.println("На пути стена высотой " + this.height + " м");
    }
}
