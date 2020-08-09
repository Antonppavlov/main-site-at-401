package ru.geekbrains.main.site.at.obstacles;

import ru.geekbrains.main.site.at.participants.Runner;

public interface Obstacles {
    /**
     * Метод принимает аргументом бегуна
     * В методе будет высчитываться прошел ли бегун испытание
     */
    void check(Runner runner);
}