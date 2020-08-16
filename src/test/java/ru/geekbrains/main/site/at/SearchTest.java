package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;

//Перейти на сайт https://geekbrains.ru/courses
//        Нажать на кнопку Поиск
//        В поле Поиск ввести текст: java
//        Проверить что отобразились блоки и в них:
//        Профессий не менее чем 2
//        Курсов более 15
//        Вебинаров больше чем 180, но меньше 300
//        В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
//        Блогов более 300
//        Форумов не 350
//        Тестов не 0
//        В Проектах и компаниях отображается GeekBrains


public class SearchTest extends BaseSettingsTest {

    @Test
    public void searchTextJava() {
        WebElement buttonSearch = driver.findElement(By.cssSelector("a>[class=\"svg-icon icon-search \"]"));
        buttonSearch.click();

        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");

        WebElement textProfessions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement textCourses = driver.findElement(By.xpath("//header//h2[text()=\"Курсы\"]"));
        WebElement textWebinar = driver.findElement(By.xpath("//header//h2[text()=\"Вебинары\"]"));
        WebElement textBlog = driver.findElement(By.xpath("//header//h2[text()=\"Блоги\"]"));
        WebElement textForum = driver.findElement(By.xpath("//header//h2[text()=\"Форум\"]"));
        WebElement textTests = driver.findElement(By.xpath("//header//h2[text()=\"Тесты\"]"));
        WebElement textProject = driver.findElement(By.xpath("//header//h2[text()=\"Проекты и компании\"]"));

        wait30second.until(ExpectedConditions.visibilityOf(textProfessions));
        wait30second.until(ExpectedConditions.visibilityOf(textCourses));
        wait30second.until(ExpectedConditions.visibilityOf(textWebinar));
        wait30second.until(ExpectedConditions.visibilityOf(textBlog));
        wait30second.until(ExpectedConditions.visibilityOf(textForum));
        wait30second.until(ExpectedConditions.visibilityOf(textTests));
        wait30second.until(ExpectedConditions.visibilityOf(textProject));


//        Профессии
//                Курсы
//        Вебинары
//                Блоги
//        Форум
//                Тесты
//        Проекты и компании


    }
}
