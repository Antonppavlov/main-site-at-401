package ru.geekbrains.main.site.at.example1;

public class Start {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.name = "Том";

        CatFood catFood = new CatFood();
        catFood.nameProduct = "Purina One";

        tom.eat(catFood);
    }
}
