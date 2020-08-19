package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;

import java.util.stream.Stream;

//        Перейти на сайт https://geekbrains.ru/career
//        Нажать на кнопку Форум
//        Проверить что страница Форум открылась
//        Повторить для
//        Вебинары
//        Блог
//        Тесты
//        Карьера

@DisplayName("Навигация")
public class NavigationWebTest extends BaseWebSettingsTest {

//    Перейти на сайт https://geekbrains.ru/events
//    Нажать на кнопку Курсы
//    Проверить что страница Курсы открылась
//    Повторить для
//    Курсы
//    Вебинары
//    Форум
//    Блог
//    Тесты
//    Карьера
//    Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как минимум самого блока)


    @Test
    void navigation() {
        driver.get("https://geekbrains.ru/career");
        WebElement eventsButton = driver.findElement(By.cssSelector("aside nav [href=\"/events\"]"));
        eventsButton.click();

        WebElement eventsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));

//        Thread.sleep(3000);
        Assertions.assertEquals("Вебинары", eventsTitlePage.getText());

//        href="/topics"
        driver.findElement(By.cssSelector("aside nav [href=\"/topics\"]")).click();
        String textTopics = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).getText();
        Assertions.assertEquals("Форум", textTopics);
//        href="/posts"
        driver.findElement(By.cssSelector("aside nav [href=\"/posts\"]")).click();
        String textPosts = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).getText();
        Assertions.assertEquals("Блог", textPosts);
//        href="/tests"

        driver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
        driver.findElement(By.cssSelector("button>[class=\"svg-icon icon-popup-close-button \"]")).click();

        driver.findElement(By.cssSelector("aside nav [href=\"/tests\"]")).click();
        String textTest = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).getText();
        Assertions.assertEquals("Тесты", textTest);
//        href="/career"
        driver.findElement(By.cssSelector("aside nav [href=\"/career\"]")).click();
        String textCareer = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).getText();
        Assertions.assertEquals("Карьера", textCareer);
    }
}