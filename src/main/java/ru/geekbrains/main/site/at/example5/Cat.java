package ru.geekbrains.main.site.at.example5;

public class Cat extends Animal {
    public void meows(){
        System.out.println(this.getClass().getName() + " " + name + " мяукает");
    }
}
