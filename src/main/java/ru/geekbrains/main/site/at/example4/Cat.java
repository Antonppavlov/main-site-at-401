package ru.geekbrains.main.site.at.example4;

public class Cat extends Animal {
    public void meows(){
        System.out.println(this.getClass().getName() + " " + name + " мяукает");
    }
}
