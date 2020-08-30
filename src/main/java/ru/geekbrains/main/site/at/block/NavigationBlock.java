package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.page.CoursePage;
import ru.geekbrains.main.site.at.page.HomePage;
import ru.geekbrains.main.site.at.page.base.BaseContentPage;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

public class NavigationBlock extends BasePage {

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

    @Step("Нажатие в Навигации на кнопку: '{nameButton}'")
    public BaseContentPage clickButton(NameButton nameButton) {
        BaseContentPage baseContentPage = new BaseContentPage(driver);

        switch (nameButton) {
            case HOME: {
                baseContentPage = new HomePage(driver);
                break;
            }
            case COURSES: {
                this.buttonCourses.click();
                baseContentPage = new CoursePage(driver);
                break;
            }
            case WEBINARS: {
                this.buttonWebinars.click();
                //TODO доработать для данного условия
                //TODO необходимо создать Page для этой страницы
                break;
            }
            case FORUM: {
                this.buttonForum.click();
                //TODO доработать для данного условия
                //TODO необходимо создать Page для этой страницы
                break;
            }
            case BLOG: {
                this.buttonBlog.click();
                //TODO доработать для данного условия
                //TODO необходимо создать Page для этой страницы
                break;
            }
            case TESTS: {
                this.buttonTests.click();
                //TODO доработать для данного условия
                //TODO необходимо создать Page для этой страницы
                break;
            }
            case CAREER: {
                this.buttonCareer.click();
                //TODO доработать для данного условия
                //TODO необходимо создать Page для этой страницы
                break;
            } default:{
                throw new ButtonNotFoundException("Кнопки: " + nameButton + " нет на странице!\n" +
                        "Или условие не описано в switch!");
            }
        }
        return  baseContentPage;
    }

    public enum NameButton {
        HOME("Главная"),
        COURSES("Курсы"),
        WEBINARS("Вебинары"),
        FORUM("Форум"),
        BLOG("Блог"),
        TESTS("Тесты"),
        CAREER("Карьера");

        NameButton(String text) {
            this.text = text;
        }

        private String text;

        public String getText() {
            return text;
        }
    }
}
