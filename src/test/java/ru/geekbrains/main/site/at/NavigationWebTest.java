package ru.geekbrains.main.site.at;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.HomePage;

import java.util.stream.Stream;

import static ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;

//        Перейти на сайт https://geekbrains.ru/career
//        Нажать на кнопку Форум
//        Проверить что страница Форум открылась
//        Повторить для
//        Вебинары
//        Блог
//        Тесты
//        Карьера

@Epic("Web UI Тест")
@Feature("Навигация")
@Story("Переход по навигации")
@DisplayName("Навигация")
@Execution(ExecutionMode.CONCURRENT)
public class NavigationWebTest extends BaseWebSettingsTest {

    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(NameButton nameButton) {
        driver.get("https://geekbrains.ru/career");
        new HomePage(driver)
                .getNavigationBlock().clickButton(nameButton)
                .checkPageName(nameButton);
    }


    public static Stream<NameButton> stringProviderNotPopUp() {
        return Stream.of(
                NameButton.WEBINARS,
                NameButton.FORUM,
                NameButton.BLOG,
                NameButton.TESTS
        );
    }


    @DisplayName("Проверка страницы Блог с PopUP")
    @Test
    public void checkNavigationPopUp() {
        driver.get("https://geekbrains.ru/career");

        new HomePage(driver)
                .getNavigationBlock().clickButton(NameButton.BLOG)
                .closePopUp()
                .checkPageName(NameButton.BLOG);
    }
}