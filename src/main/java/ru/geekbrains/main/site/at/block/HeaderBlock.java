package ru.geekbrains.main.site.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.page.SearchPage;

public class HeaderBlock extends BasePage {

    @FindBy(css = "[class='gb-header__title']")
    protected WebElement headerTitlePage;

    @FindBy(css = "[id='top-menu'] [class='show-search-form'] svg")
    protected WebElement buttonSearch;

    @FindBy(css = "input[class='search-panel__search-field']")
    protected WebElement inputSearch;

    public HeaderBlock(WebDriver driver) {
        super(driver);
    }

    public HeaderBlock checkNamePage(String exampleNamePage) {
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerTitlePage, exampleNamePage));
        return this;
    }

    public SearchPage searchText(String text) {
        buttonSearch.click();
        inputSearch.sendKeys(text);
        return new SearchPage(driver);
    }
}
