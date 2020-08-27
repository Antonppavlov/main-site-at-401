package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.page.CoursePage;

public class ContentNavigationCourseBlock extends BasePage {

    @FindBy(css = "[class*='nav nav-tabs'] [id='prof-link']")
    private WebElement tabProfessions;

    @FindBy(css = "[class*='nav nav-tabs'] [id='free-link']")
    private WebElement tabFreeIntensive;

    @FindBy(css = "[class*='nav nav-tabs'] [id='cour-link']")
    private WebElement tabCourses;

    @FindBy(css = "[class*='nav nav-tabs'] [href*='https://forbusiness']")
    private WebElement tabCompanies;

    public ContentNavigationCourseBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Нажатие в выборе Типов Курсов на кнопку: '{tab}'")
    public CoursePage clickTab(String tab) {
        switch (tab) {
            case "Профессии": {
                tabProfessions.click();
                //TODO нужно реализовать для данного блока
            }
            case "Бесплатные интенсивы": {
                tabFreeIntensive.click();
                //TODO нужно реализовать для данного блока
            }
            case "Курсы": {
                tabCourses.click();

            }
            case "Компаниям": {
                tabCompanies.click();
                //TODO нужно реализовать для данного блока
            }
        }
        return new CoursePage(driver);
    }
}
