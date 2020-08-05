package ru.geekbrains.main.site.at.example8and9;

public abstract class Animal {

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

    public abstract void sleep();

}
