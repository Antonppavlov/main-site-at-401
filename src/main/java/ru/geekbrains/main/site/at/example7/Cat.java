package ru.geekbrains.main.site.at.example7;

public class Cat extends Animal {

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
}
