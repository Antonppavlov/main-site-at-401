package ru.geekbrains.main.site.at;

import ru.geekbrains.main.site.at.obstacles.Treadmill;
import ru.geekbrains.main.site.at.obstacles.Wall;
import ru.geekbrains.main.site.at.participants.Cat;
import ru.geekbrains.main.site.at.participants.Human;
import ru.geekbrains.main.site.at.participants.Robot;
import ru.geekbrains.main.site.at.participants.Runner;
import ru.geekbrains.main.site.at.obstacles.Obstacles;

/**
Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
————————————————————————
Создайте два класса: беговая дорожка и стена,
при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
————————————————————————
Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

————————————————————————
Задание со звездочкой:
Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */

public class Start {
    public static void main(String[] args) {
        /**
         * Создание объектов участников
         */
        Cat catTom = new Cat("Tom", 10, 5);
        Cat catLarry = new Cat("Larry", 7, 3);
        Cat catBoris = new Cat("Boris", 14, 8);

        Human humanMax = new Human("Max", 13, 4);
        Human humanAnna = new Human("Anna", 10, 2);
        Human humanAlex = new Human("Alex", 18, 6);

        Robot robotVally = new Robot("Vally", 13, 4);
        Robot robotEva = new Robot("Eva", 20, 20);
        Robot robotBender = new Robot("Bender", 10, 7);

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