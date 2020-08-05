package ru.geekbrains.main.site.at.example1;

public class Cat {
    public String name;

    public void eat(CatFood catFood) {
        System.out.println("Кот " + name + " ест еду: " + catFood.nameProduct);
    }

}
