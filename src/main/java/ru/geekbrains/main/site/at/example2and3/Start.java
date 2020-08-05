package ru.geekbrains.main.site.at.example2and3;

public class Start {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Том");

        CatFood catFood = new CatFood();
        catFood.setNameProduct("Purina One");

        tom.eat(catFood);
    }
}
