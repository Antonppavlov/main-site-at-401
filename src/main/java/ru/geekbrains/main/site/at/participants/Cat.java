package ru.geekbrains.main.site.at.participants;

public class Cat implements Runner {

    private String name;
    private int maxLength;
    private int maxWeight;
    private boolean success = true;

    public Cat(String name, int maxLength, int maxWeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
    }

    public void run() {
        System.out.println(getClass().getSimpleName() + " " + name + " бежит максимум: " + maxLength);
    }

    public void jump() {
        System.out.println(getClass().getSimpleName() + " " + name + " прыгает максимум: " + maxWeight);
    }

    public String getName() {
        return name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}