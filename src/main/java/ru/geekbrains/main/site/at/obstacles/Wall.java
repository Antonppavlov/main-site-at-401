package ru.geekbrains.main.site.at.obstacles;

import ru.geekbrains.main.site.at.participants.Runner;

public class Wall implements Obstacles {
    private int width;

    public Wall(int width) {
        this.width = width;
    }

    public void check(Runner runner) {
        runner.jump();
        if (runner.getMaxWeight() >= width) {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " выполнил испытание, перепрыгнув стену высотой: " + width);
        } else {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " не перепрыгнул стену высотой: " + width);
            runner.setSuccess(false);
        }
    }
}