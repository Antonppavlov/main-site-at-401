package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.ContentPage;

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
    void navigation() throws InterruptedException {
        driver.get("https://geekbrains.ru/career");

        ContentPage contentPage = new ContentPage(driver);

        contentPage.getNavigationBlock().clickButton("Вебинары");

        Thread.sleep(3000);
        contentPage.checkPageName("Вебинары");

//        href="/topics"
        contentPage.getNavigationBlock().clickButton("Форум");
        contentPage.checkPageName("Форум");
//        href="/posts"
        contentPage.getNavigationBlock().clickButton("Блог");
        contentPage.checkPageName("Блог");
//        href="/tests"

        contentPage.getPopUp2().click();
        contentPage.getPopUp1().click();

        contentPage.getNavigationBlock().clickButton("Тесты");
        contentPage.checkPageName("Тесты");
//        href="/career"
        contentPage.getNavigationBlock().clickButton("Карьера");
        contentPage.checkPageName("Карьера");

    }
}