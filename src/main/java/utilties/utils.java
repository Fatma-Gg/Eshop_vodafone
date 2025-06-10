package utilties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class utils {
    public static void clickOnElement(WebDriver driver, By locator){
        new WebDriverWait(driver, Duration.ofSeconds(30))
        .until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
    }

    public static void scrolltoelement(WebDriver driver, By locator)
    {

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(locator));
    }


}
