package ru.geekbrains.main.site.at.example8and9;

public class Dog extends Animal implements  HomeWork{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println(this.getClass().getName() + " " + name + " и спит как СОБАКА");
    }


    public void barking(){
        System.out.println(this.getClass().getName() + " " + name + " лает");
    }

    public void homeWork() {
        System.out.println(this.getClass().getName() + " " + name + "охраняет дом");
    }
}
