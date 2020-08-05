package ru.geekbrains.main.site.at.example4;

public class Start {
    public static void main(String[] args) {
        CatFood catFood = new CatFood();
        catFood.setNameProduct("Purina One");

        Cat tom = new Cat();
        tom.setName("Том");

        Dog spike = new Dog();
        spike.setName("Спайк");

        tom.eat(catFood);
        spike.eat(catFood);

        tom.meows();
        spike.barking();
    }
}
