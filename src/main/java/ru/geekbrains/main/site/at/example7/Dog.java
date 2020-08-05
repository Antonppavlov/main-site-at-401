package ru.geekbrains.main.site.at.example7;

public class Dog extends Animal  {

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

}
