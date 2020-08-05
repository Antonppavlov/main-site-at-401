package ru.geekbrains.main.site.at.example8and9;

public class Cat extends Animal implements HomeWork {

    public Cat(String name){
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println(this.getClass().getName() + " " + name + " и спит как КОТ");
    }


    public void meows(){
        System.out.println(this.getClass().getName() + " " + name + " мяукает");
    }

    public void homeWork() {
        sleep();
    }
}
