package ru.geekbrains.main.site.at.example6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void barking(){
        System.out.println(this.getClass().getName() + " " + name + " лает");
    }
}
