package ru.geekbrains.java.man_cat_robot;

public class Human implements Athlete{

    public int maxLenght;
    public int maxJump;

    public Human(int maxJump, int maxLenght) {
        this.maxLenght = maxLenght;
        this.maxJump = maxJump;
    }

    @Override
    public void run(RunningTrack runningTrack) {
        if (maxLenght < runningTrack.lenght) {
            System.out.println("Помру по дороге!");
        }
        else {
            System.out.println("Человек пробежал");
        }
    }

    @Override
    public int getmaxJump() {
        return maxJump;
    }

    @Override
    public int getmaxLenght() {
        return maxLenght;
    }

    public void jump (Wall wall) {
        if (maxJump < wall.height) {
            System.out.println("Слишком высокое препятствие!");
        } else {
            System.out.println("Человек перепрыгнул стену высотой " + wall.height + " м");
        }
    }
}
