package ru.geekbrains.main.site.at.example5;

public class Start {
    public static void main(String[] args) {
        CatFood catFood = new CatFood();
        catFood.setNameProduct("Purina One");

        Cat tom = new Cat();
        tom.setName("Том");

        Dog spike = new Dog();
        spike.setName("Спайк");

        Cat cat = new Cat();
        cat.setName("Бродяжка");

        Dog dog1 = new Dog();
        dog1.setName("Шарик");

        Cat cat1 = new Cat();
        cat1.setName("Бармаглот");

        Dog dog2 = new Dog();
        dog2.setName("Лорд");

        Animal[] animals = {tom, spike, cat, cat1, dog1, dog2};

        for (Animal animal : animals) {
            animal.eat(catFood);
        }
    }
}
