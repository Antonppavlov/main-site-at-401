package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.block.ContentNavigationCourseBlock;
import ru.geekbrains.main.site.at.page.base.BaseContentPage;

import java.util.List;

public class CoursePage extends BaseContentPage {

    private ContentNavigationCourseBlock contentNavigationCourseBlock;

    @FindBy(xpath = "//form/ul//label")
    private List<WebElement> filterList;

    @FindBy(xpath = "//a/div/div/span")
    private List<WebElement> courseList;

    public CoursePage(WebDriver driver) {
        super(driver);
        this.contentNavigationCourseBlock = new ContentNavigationCourseBlock(driver);
    }

    @Override
    @Step("Закрытие PopUp")
    public CoursePage closePopUp(){
        buttonClosedPopUp2.click();
        return this;
    }

    @Step("Настройка фильтра курсов: '{args}'")
    public CoursePage configFilter(String... args) {
        for (String test : args) {
            WebElement element = findElement(filterList, test);
            element.click();
        }
        return this;
    }

    @Step("Проверка отображения курсов: '{args}'")
    public CoursePage checkingDisplayedCourses(String... args) {
        for (String test : args) {
            WebElement element = findElement(courseList, test);
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
        }
        return this;
    }

    public ContentNavigationCourseBlock getContentNavigationCourseBlock() {
        return contentNavigationCourseBlock;
    }
}
