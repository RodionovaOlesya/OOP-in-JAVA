package ru.geekbrains.java.man_cat_robot;

public class RunningTrack implements Barrier {
    public int lenght;

    public RunningTrack(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean getOver(Athlete athlete) {
        return athlete.getmaxLenght() >= lenght;
    }
}
