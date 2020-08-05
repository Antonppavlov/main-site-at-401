package ru.geekbrains.main.site.at.example6;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(CatFood catFood) {
        System.out.println(this.getClass().getName() + " " + name + " ест еду: " + catFood.getNameProduct());
    }


}
