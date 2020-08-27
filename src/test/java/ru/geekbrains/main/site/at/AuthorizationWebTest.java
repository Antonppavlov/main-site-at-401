package ru.geekbrains.main.site.at;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

//Реализовать тест:
//1. Перейти на страницу авторизация https://geekbrains.ru/login
//2. Ввести логин : hks47018@eoopy.com
//3. Пароль: hks47018
//4. Нажать кнопку войти
//5. Проверить что отобразилась страница "Главная"

@Epic("Web UI тесты")
@Feature("Авторизация")
@Story("Успешная авторизация")
@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebSettingsTest {

    @DisplayName("Авторизация с почтой 10минут")
    @Test
    void name1() {
        driver.get("https://geekbrains.ru/login");
        new AuthorizationPage(driver)
                .singIn("hks47018@eoopy.com", "hks47018")
                .checkPageName("Главная");

    }
}
