package ru.geekbrains.main.site.at;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;
import ru.geekbrains.main.site.at.page.AuthorizationPage;
import ru.geekbrains.main.site.at.page.CoursePage;

import static example.Example.WEB_UI_TEST;


@Epic(WEB_UI_TEST)
@Feature("Поиск")
@Story("Проверка отображения блоков")
@DisplayName("Страница Курсы")
public class CourseWebTest extends BaseWebSettingsTest {


    //Реализовать тест:
//1. Перейти на страницу авторизация https://geekbrains.ru/login
//2. Ввести логин : hks47018@eoopy.com
//3. Пароль: hks47018
//4. Нажать кнопку войти
//5. Проверить что отобразилась страница "Главная"
//6. Нажать в навигации "Курсы"
//7. Проверить что отобразилась страница "Курсы"
//8. Нажать в шапке сайта "Курсы"
//9. Выбрать в фильтрах чекбокс "Бесплатные"
//10. Выбрать в фильтрах чекбокс "Тестирование"
//11. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 1"
//11\2. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 2"


    @DisplayName("Проверка работы фильтров")
    @Test
    void checkSingInValidLogin() {
        driver.get("https://geekbrains.ru/login");

        new AuthorizationPage(driver)
                .singIn("hks47018@eoopy.com", "hks47018")
                .checkPageName(NameButton.HOME)
                .getNavigationBlock().clickButton(NameButton.COURSES);

        new CoursePage(driver)
                .getContentNavigationCourseBlock().clickTab("Курсы")
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses(
                        "Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2"
                )
        ;

    }
}
