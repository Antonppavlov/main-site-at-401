package ru.geekbrains.main.site.at.example4;

public class Dog extends Animal {

    public void barking(){
        System.out.println(this.getClass().getName() + " " + name + " лает");
    }
}
