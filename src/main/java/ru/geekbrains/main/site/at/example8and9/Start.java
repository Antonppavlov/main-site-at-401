package ru.geekbrains.main.site.at.example8and9;

public class Start {
    public static void main(String[] args) {
        CatFood catFood = new CatFood();
        catFood.setNameProduct("Purina One");

        Cat tom = new Cat("Том");
        Dog spike = new Dog("Спайк");
        Cat cat = new Cat("Бродяжка");
        Dog dog1 = new Dog("Шарик");
        Cat cat1 = new Cat("Бармаглот");
        Dog dog2 = new Dog("Лорд");
        Mouse jerry = new Mouse("Джерри");

        Animal[] animals = {tom, spike, cat, cat1, dog1, dog2, jerry};


        for (Animal animal : animals) {
            animal.eat(catFood);
            animal.sleep();
        }

        System.out.println("----------------------");

        HomeWork[] homeAnimals = {tom, spike, cat, cat1, dog1, dog2};


        for (HomeWork animal : homeAnimals) {
            animal.homeWork();
        }
    }
}
