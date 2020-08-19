package ru.geekbrains.main.site.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BaseSettingsTest {

    public ChromeDriver chromeDriver;
    public WebDriverWait wait15second;

    @BeforeEach
    public void baseTestBeforeAll() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        chromeDriver.manage().window().maximize();

        chromeDriver.get("https://geekbrains.ru/events");

        wait15second = new WebDriverWait(chromeDriver, 15);
    }


    @AfterEach
    public void BaseTestAfterAll() {
        chromeDriver.quit();
    }
}
