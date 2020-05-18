package ru.geekbrains.java.man_cat_robot;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       Human mrFirst = new Human(5, 2);
       Cat barsik = new Cat(10,3);
       Wall firstWall = new Wall(2);
       Wall secondWall = new Wall(10);
       RunningTrack firstTrack = new RunningTrack(3);

        mrFirst.walk();
        firstWall.showInfo();
        mrFirst.jump(firstWall);
        mrFirst.walk();
        secondWall.showInfo();
        mrFirst.jump(secondWall);

        firstTrack.showInfo();
        mrFirst.run(firstTrack);

       /* Human [] member = new Human [2];
        member[0] = mrFirst;*/

        barsik.jump(firstWall);
        barsik.run(firstTrack);

    }
public static void goBarrier (Barrier barrier) {
    barrier.showInfo();
}
}
