package ru.geekbrains.main.site.at.example2and3;

public class Cat {
    private String name;

    public void eat(CatFood catFood) {
        System.out.println("Кот " + name + " ест еду: " + catFood.getNameProduct());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
