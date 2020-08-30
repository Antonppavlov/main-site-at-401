package ru.geekbrains.main.site.at;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.block.NavigationBlock;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

import static example.Example.WEB_UI_TEST;
import static org.hamcrest.Matchers.*;

//        Перейти на сайт https://geekbrains.ru/courses
//        Нажать на кнопку Поиск
//        В поле Поиск ввести текст: java
//        Проверить что отобразились блоки и в них:
//        Профессий не менее чем 2
//        Курсов более 15
//        Вебинаров больше чем 180, но меньше 300
//        Блогов более 300
//        Форумов не 350
//        Тестов не 0


@Epic(WEB_UI_TEST)
@Feature("Поиск")
@Story("Проверка отображения всех блоков")

@DisplayName("Поиск")
public class SearchWebTest extends BaseWebSettingsTest {


    @DisplayName("Проверка количества контента")
    @Test
    @Description("Дополнительная информация по тесту")
    @Issue("GMS-1005")
    @TmsLink("GMS-30")
    void searchTest() {
        driver.get("https://geekbrains.ru/login");
        new AuthorizationPage(driver)
                .singIn("hks47018@eoopy.com","hks47018")
                .checkPageName(NavigationBlock.NameButton.HOME)
                .getHeaderBlock()
                .searchText("java")
                .getSearchTabsBlock()
                .checkCount("Профессии", greaterThanOrEqualTo(2))
                .checkCount("Курсы", greaterThan(15))
                .checkCount("Вебинары", allOf(greaterThan(180), lessThan(300)))
                .checkCount("Блоги", greaterThan(300))
                .checkCount("Форумы", not(350))
                .checkCount("Тесты", not(0));
    }
}