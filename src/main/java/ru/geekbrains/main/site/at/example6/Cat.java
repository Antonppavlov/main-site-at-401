package ru.geekbrains.main.site.at.example6;

public class Cat extends Animal {

    public Cat(String name){
      super(name);
    }


    public void meows(){
        System.out.println(this.getClass().getName() + " " + name + " мяукает");
    }
}
