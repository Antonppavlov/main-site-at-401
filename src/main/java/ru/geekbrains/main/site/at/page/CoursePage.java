package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.block.ContentNavigationCourseBlock;
import ru.geekbrains.main.site.at.block.HeaderBlock;
import ru.geekbrains.main.site.at.block.NavigationBlock;

import java.util.ArrayList;
import java.util.List;

public class CoursePage extends BasePage {

    private HeaderBlock headerBlock;
    private NavigationBlock navigationBlock;
    private ContentNavigationCourseBlock contentNavigationCourseBlock;

    @FindBy(xpath = "//form/ul//label")
    private List<WebElement> filterList;

    @FindBy(xpath = "//a/div/div/span")
    private List<WebElement> courseList;

    @FindBy(css = "button>[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement popUp2;

    public CoursePage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        this.navigationBlock = new NavigationBlock(driver);
        this.contentNavigationCourseBlock = new ContentNavigationCourseBlock(driver);
    }

    @Step("Закрытие PopUp")
    public CoursePage closePopUp(){
        popUp2.click();
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

    @Step("Поиск элемента в коллекции по тексту: '{expectedText}'")
    private WebElement findElement(List<WebElement> list, String expectedText) {
        List<String> arrayList = new ArrayList<>();
        for (WebElement webElement : list) {
            String actualText = webElement.getText();
            arrayList.add(actualText);
            if (actualText.toLowerCase().trim().equals(expectedText.toLowerCase().trim())) {
                return webElement;
            }
        }
        throw new RuntimeException("В коллекции элементов: " + arrayList + "\nНе найден элемент с тектом: " + expectedText);
    }

    public ContentNavigationCourseBlock getContentNavigationCourseBlock() {
        return contentNavigationCourseBlock;
    }
}
