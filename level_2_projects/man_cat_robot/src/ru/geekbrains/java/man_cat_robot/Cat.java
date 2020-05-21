package ru.geekbrains.java.man_cat_robot;

public class Cat implements Athlete {
    private int maxLenght;
    private int maxJump;

    public Cat (int maxLenght, int maxJump) {
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
}
