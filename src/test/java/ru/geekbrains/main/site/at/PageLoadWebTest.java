package ru.geekbrains.main.site.at;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.block.NavigationBlock;
import ru.geekbrains.main.site.at.page.AuthorizationPage;
import ru.geekbrains.main.site.at.page.SearchPage;

import java.time.Duration;

import static example.Example.WEB_UI_TEST;
import static org.hamcrest.Matchers.*;

//Перейти на сайт https://geekbrains.ru/courses
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
@Story("Проверка скорости работы поиска")
public class PageLoadWebTest extends BaseWebSettingsTest {

    @DisplayName("Поиск загружается быстрее чем за 3 секунд")
    @Test
    @Issue("Issue_LINK")
    @TmsLink("BUG_LINK")
    void searchLoadsInLessThan3Seconds() {

        SearchPage searchPage = new AuthorizationPage(driver)
                .openURL()
                .singIn("hks47018@eoopy.com", "hks47018")
                .checkPageName(NavigationBlock.NameButton.HOME)
                .getHeaderBlock()
                .searchText("java");

        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
                    searchPage.getSearchTabsBlock()
                            .checkCount("Профессии", greaterThanOrEqualTo(2))
                            .checkCount("Курсы", greaterThan(15))
                            .checkCount("Вебинары", allOf(greaterThan(180), lessThan(300)))
                            .checkCount("Блоги", greaterThan(300))
                            .checkCount("Форумы", not(350))
                            .checkCount("Тесты", not(0));
                },
                "Поиск отображается дольше 3 секунд");

    }
}