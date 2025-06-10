package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilties.utils;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    //Locator

    By LoginBtn = By.id("userProfileMenu");
    By phone = By.id("username");
    By password = By.id("password");
    By clickonlogin = By.xpath("//input[@id='submitBtn']");
    By acceptcookies= By.cssSelector("button#onetrust-accept-btn-handler");


    public void login() {

        utils.clickOnElement(driver, acceptcookies);
        utils.clickOnElement(driver, LoginBtn);
        driver.findElement(phone).sendKeys("01024455124");
        driver.findElement(password).sendKeys("Ss12345$");
        utils.clickOnElement(driver, clickonlogin);
    }
}
