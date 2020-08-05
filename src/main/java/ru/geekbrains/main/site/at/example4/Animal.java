package ru.geekbrains.main.site.at.example4;

public class Animal {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(CatFood catFood) {
        System.out.println(this.getClass().getName() + " " + name + " ест еду: " + catFood.getNameProduct());
    }


}
