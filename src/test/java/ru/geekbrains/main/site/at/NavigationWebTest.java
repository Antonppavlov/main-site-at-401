package ru.geekbrains.main.site.at;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.ContentPage;

import java.util.stream.Stream;

//        Перейти на сайт https://geekbrains.ru/career
//        Нажать на кнопку Форум
//        Проверить что страница Форум открылась
//        Повторить для
//        Вебинары
//        Блог
//        Тесты
//        Карьера

@Epic("Web UI тесты")
@Feature("Навигация")
@Story("Переход по навигации")
@DisplayName("Навигация")
public class NavigationWebTest extends BaseWebSettingsTest {

    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(String button) {
        driver.get("https://geekbrains.ru/career");
        new ContentPage(driver)
                .getNavigationBlock().clickButton(button)
                .checkPageName(button);
    }


    public static Stream<String> stringProviderNotPopUp() {
        return Stream.of(
                "Вебинары",
                "Форум",
                "Блог",
                "Тесты"
        );
    }


    @DisplayName("Проверка страницы Блог с PopUP")
    @Test
    public void checkNavigationPopUp() {
        driver.get("https://geekbrains.ru/career");

        new ContentPage(driver)
                .getNavigationBlock().clickButton("Блог")
                .closePopUp()
                .checkPageName("Блог");
    }
}