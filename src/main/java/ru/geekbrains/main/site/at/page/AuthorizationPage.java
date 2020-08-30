package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;

public class AuthorizationPage extends BasePage implements IOpenURL {

    @FindBy(css = "#user_email")
    private WebElement inputLogin;

    @FindBy(css = "#user_password")
    private WebElement inputPassword;

    @FindBy(css = "[data-testid=\"login-submit\"]")
    private WebElement buttonSingIn;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Авторизация с логин {login} и пароль {password}")
    public ContentPage singIn(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingIn.click();
        return new ContentPage(driver);
    }

    @Override
    public AuthorizationPage openURL() {
        openPageInBrowser("https://geekbrains.ru/login");
        return this;
    }
}
