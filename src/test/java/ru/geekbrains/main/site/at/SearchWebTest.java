package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseWebSettingsTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

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


public class SearchWebTest extends BaseWebSettingsTest {

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

        WebElement professionsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='professions']/span"));
        WebElement coursesCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='courses']/span"));
        WebElement eventsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='webinars']/span"));
        WebElement blogsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='blogs']/span"));
        WebElement forumsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='forums']/span"));
        WebElement testsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='tests']/span"));
        WebElement firstWebinarInList = driver.findElement(By.xpath("//a[@class='event__title h3 search_text']"));


        assertThat(Integer.parseInt(professionsCount.getText()), greaterThanOrEqualTo(2));
        assertThat(Integer.parseInt(coursesCount.getText()), greaterThan(15));
        assertThat(Integer.parseInt(eventsCount.getText()), allOf(greaterThan(180), lessThan(300)));
        assertThat(Integer.parseInt(blogsCount.getText()), greaterThan(300));
        assertThat(Integer.parseInt(forumsCount.getText()), not(equalTo(350)));
        assertThat(Integer.parseInt(testsCount.getText()), not(equalTo(0)));
        assertThat(firstWebinarInList.getText(), equalTo("Java Junior. Что нужно знать для успешного собеседования?"));

    }
}
