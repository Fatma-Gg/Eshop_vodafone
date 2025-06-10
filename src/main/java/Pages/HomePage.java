package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilties.utils;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    //locators
    By firstItem = By.id("name-/jbl-go4-jblg04blu---bluetooth-speaker");
    By SecondItem= By.id("name-/lenovo-ideapad-3-15alc6-ryzen-7-5700u-8-cores-8gb-ram-1tb-hdd-amd-radeon-graphics-156-fhd-dos-arctic-grey");
    By confirmationMessage =By.xpath("//p[text()='Item added to cart successfully!']");
    By SearchBar = By.id("searchInput");
    By SelectSearch = By.id("product-0");
    By addProductToCart = By.xpath("//button[@class='add-to-cart']");



    //Methods
    public void chooseFirstItem() {
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element =driver.findElement(firstItem);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        utils.clickOnElement(driver,firstItem);
        utils.clickOnElement(driver,addProductToCart);
    }



    public boolean isItemAdded()  {

    return driver.findElement(confirmationMessage).isDisplayed();

}


    public void chooseSecondItem() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement TheElement =driver.findElement(SecondItem);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        actions.moveToElement(TheElement);
        actions.perform();
        utils.clickOnElement(driver,SecondItem);
        utils.clickOnElement(driver,addProductToCart);


    }
    public void choosethirdItem() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.visibilityOfElementLocated(SearchBar));
        driver.findElement(SearchBar).sendKeys("infinix-xe23-true-wireless");
        utils.clickOnElement(driver,SelectSearch);
        utils.clickOnElement(driver,addProductToCart);

    }

    }

