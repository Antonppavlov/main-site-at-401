package ru.geekbrains.main.site.at;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;


@Epic("Web UI тесты")
@Feature("Авторизация")
@Story("Успешная авторизация")
@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebSettingsTest {

//    @Test
//    void name() {
//        driver.get("https://geekbrains.ru/login");
//        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
//        authorizationPage.getInputLogin().sendKeys("hks47018@eoopy.com");
//        authorizationPage.getInputPassword().sendKeys("hks47018");
//        authorizationPage.getButtonSingIn().click();
//
//        ContentPage contentPage = new ContentPage(driver);
//        contentPage.checkPageName("Главная");
//    }



    @DisplayName("Авторизация с почтой 10минут")
    @Test
    void name1() {
        driver.get("https://geekbrains.ru/login");
        new AuthorizationPage(driver)
                .singIn("hks47018@eoopy.com", "hks47018")
                .checkPageName("Главная");

    }
}
