package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTabsBlock extends BasePage {

    @FindBy(css = "[class='search-page-tabs'] [data-tab='all']")
    private WebElement tabEveryWhere;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='professions']")
    private WebElement tabProfessions;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='courses']")
    private WebElement tabCourses;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='webinars']")
    private WebElement tabWebinars;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='blogs']")
    private WebElement tabBlogs;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='forums']")
    private WebElement tabForums;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='tests']")
    private WebElement tabTests;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='companies']")
    private WebElement tabCompanies;

    public SearchTabsBlock(WebDriver driver) {
        super(driver);
    }

    public void clickTab(String tabName) {
        getTab(tabName).click();
    }

    @Step("проверка что в: '{tabName}' количество: '{matcher}'")
    public SearchTabsBlock checkCount(String tabName, Matcher<Integer> matcher) {
        String actualCount = getTab(tabName).findElement(By.cssSelector("span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
    }

    private WebElement getTab(String tabName) {
        switch (tabName) {
            case "Везде":
                return tabEveryWhere;
            case "Профессии":
                return tabProfessions;
            case "Курсы":
                return tabCourses;
            case "Вебинары":
                return tabWebinars;
            case "Блоги":
                return tabBlogs;
            case "Форумы":
                return tabForums;
            case "Тесты":
                return tabTests;
            case "Компании":
                return tabCompanies;
            default:
                throw new ButtonNotFoundException("Элемента: "+tabName+" нет на странице!");
        }
    }
}
