package ru.geekbrains.java.man_cat_robot;

public class RunningTrack implements Barrier {
    int trackDistance;

public RunningTrack(int trackDistance) {
    this.trackDistance = trackDistance;
    }

    @Override
    public void showInfo() {
        System.out.println("Дистанция на беговой дорожке " + this.trackDistance + " км");
    }
}
