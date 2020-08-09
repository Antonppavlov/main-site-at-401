package ru.geekbrains.main.site.at.obstacles;

import ru.geekbrains.main.site.at.participants.Runner;

public class Treadmill implements Obstacles {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void check(Runner runner) {
        runner.run();
        if (runner.getMaxLength() >= length) {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " выполнил испытание, пробежав дорожку длиной: " + length);
        } else {
            runner.setSuccess(false);
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " не пробежал дорожку длиной: " + length);
        }
    }
}