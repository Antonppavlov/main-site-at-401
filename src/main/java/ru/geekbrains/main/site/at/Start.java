package ru.geekbrains.main.site.at;

import ru.geekbrains.main.site.at.obstacles.Treadmill;
import ru.geekbrains.main.site.at.obstacles.Wall;
import ru.geekbrains.main.site.at.participants.Cat;
import ru.geekbrains.main.site.at.participants.Human;
import ru.geekbrains.main.site.at.participants.Robot;
import ru.geekbrains.main.site.at.participants.Runner;
import ru.geekbrains.main.site.at.obstacles.Obstacles;

public class Start {
    public static void main(String[] args) {
        /**
         * Создание объектов участников
         */
        Runner catTom = new Cat("Tom", 10, 5);
        Runner catLarry = new Cat("Larry", 7, 3);
        Runner catBoris = new Cat("Boris", 14, 8);

        Runner humanMax = new Human("Max", 13, 4);
        Runner humanAnna = new Human("Anna", 10, 2);
        Runner humanAlex = new Human("Alex", 18, 6);

        Runner robotVally = new Robot("Vally", 13, 4);
        Runner robotEva = new Robot("Eva", 20, 20);
        Runner robotBender = new Robot("Bender", 10, 7);

        /**
         * Объединение участников в массив
         */
        Runner[] runners = {catTom, catLarry, catBoris, humanMax, humanAnna, humanAlex, robotVally, robotEva, robotBender};


        /**
         * Создание объектов препятствий
         */
        Obstacles wall = new Wall(5);
        Obstacles wall1 = new Wall(6);
        Obstacles wall2 = new Wall(7);

        Obstacles treadmill = new Treadmill(10);
        Obstacles treadmill1 = new Treadmill(14);
        Obstacles treadmill2 = new Treadmill(15);

        /**
         * Объединение препятствий в массив
         */
        Obstacles[] obstacles = {wall, wall1, wall2, treadmill, treadmill1, treadmill2};


        System.out.println("Гонка началась!");

        /**
         * Запускаю гонку и в первом цикле по одному обращаюсь к препятствиям
         * Сделано через цикл for а не foreach чтобы отображать номер испытания в консоль
         */
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("\n\nИспытание " + (i + 1));

            /**
             * В данном цикле по одному обращаюсь к каждому бегуну
             * проверяю что он прошел прошлое испытание - runner.getSuccess()
             * если да то передаю его в метод check объекта типа Obstacles (Препятствие) - obstacles[i].check(runner);
             * в методе check происходит проверка: прошел бегут испытание или нет.
             */
            for (Runner runner : runners) {
                if (runner.getSuccess()) {
                    System.out.println("------------");
                    obstacles[i].check(runner);
                }

            }
        }
    }
}