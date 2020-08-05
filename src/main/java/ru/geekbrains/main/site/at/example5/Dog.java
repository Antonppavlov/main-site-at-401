package ru.geekbrains.main.site.at.example5;

public class Dog extends Animal {

    public void barking(){
        System.out.println(this.getClass().getName() + " " + name + " лает");
    }
}
