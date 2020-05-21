package ru.geekbrains.java.man_cat_robot;

public class Main {

    public static void main(String[] args) {
        Human mrFirst = new Human (2, 20);
        Cat barsik = new Cat(10, 3);
        Cat murzik = new Cat (15, 4);

        Athlete[] athletes = {mrFirst, barsik, murzik};

        Wall firstWall = new Wall(2);
        Wall secondWall = new Wall(10);
        RunningTrack firstTrack = new RunningTrack(3);

       // mrFirst.jump(firstWall);

       Barrier[] barriers = {firstWall, secondWall, firstTrack};

       for (Athlete a: athletes) {
            for (Barrier b: barriers) {
                boolean result = b.getOver(a);
                if (result){
                    System.out.println("Участник преодолел препятствие");
                }
                else  {
                    System.out.println("Препятствие непреодолимо!");
                }
            }
        }
    }
}
