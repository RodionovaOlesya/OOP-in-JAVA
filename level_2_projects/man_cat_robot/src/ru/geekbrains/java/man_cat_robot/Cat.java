package ru.geekbrains.java.man_cat_robot;

public class Cat {
    public int max_distance;
    public int max_height;

    public Cat (int max_distance, int max_height) {
        this.max_distance = max_distance;
        this.max_height = max_height;
    }

    public void jump (Wall wall) {
        if (max_height < wall.height) {
            System.out.println("Слишком высокое препятствие!");
        } else {
            System.out.println("Кот перепрыгнул стену высотой " + wall.height + " м");
        }
    }

    public void run (RunningTrack runningTrack) {
        if (max_distance < runningTrack.trackDistance) {
            System.out.println("Я же вам не лошадь!");
        }
        else {
            System.out.println("Кот пробежал дистанцию " + runningTrack.trackDistance + " км");
        }
    }
}
