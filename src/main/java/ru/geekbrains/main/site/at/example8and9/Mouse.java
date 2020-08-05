package ru.geekbrains.main.site.at.example8and9;

public class Mouse extends Animal {
    public Mouse(String name) {
        super(name);
    }

    public void sleep() {
        System.out.println(this.getClass().getName() + " " + name + " и спит как МЫШЬ");
    }
}
