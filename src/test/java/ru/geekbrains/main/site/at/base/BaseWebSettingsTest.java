package ru.geekbrains.main.site.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BaseWebSettingsTest {

    protected WebDriver driver;
    protected WebDriverWait wait30second;
    protected WebDriverWait wait15second;

    @BeforeEach
    public void beforeAllTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://geekbrains.ru/career");

        wait30second = new WebDriverWait(driver, 30);
        wait15second = new WebDriverWait(driver, 15);
    }

    @AfterEach
    public void afterAllTest() {
        driver.quit();
    }
}
