package ru.geekbrains.main.site.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;

public class NavigationBlock extends BasePage{

    @FindBy(css = "[class=\"gb-left-menu__logo \"]")
    private WebElement icon;

    @FindBy(css = "[href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(css = "[href='/events']")
    private WebElement buttonWebinars;

    @FindBy(css = "[href=\"/topics\"]")
    private WebElement buttonForum;

    @FindBy(css = "[href=\"/posts\"]")
    private WebElement buttonBlog;

    @FindBy(css = "[href=\"/tests\"]")
    private WebElement buttonTests;

    @FindBy(css = "[href=\"/career\"]")
    private WebElement buttonCareer;

    public NavigationBlock(WebDriver driver) {
        super(driver);
    }

    public void clickButton(String nameButton){
        switch (nameButton){
            case "Иконка" : {
                this.icon.click();
                return;
            }
            case "Курсы" : {
                this.buttonCourses.click();
                return;
            }
            case "Вебинары" : {
                this.buttonWebinars.click();
                return;
            }
            case "Форум" : {
                this.buttonForum.click();
                return;
            }
            case "Блог" : {
                this.buttonBlog.click();
                return;
            }
            case "Тесты" : {
                this.buttonTests.click();
                return;
            }
            case "Карьера" : {
                this.buttonCareer.click();
                return;
            }
            default:{
                throw new RuntimeException("Кнопки: "+nameButton+" нет на странице!");
            }
        }
    }
}


//    Иконка
//    Курсы
//    Вебинары
//    Форум
//    Блог
//    Тесты
//    Карьера