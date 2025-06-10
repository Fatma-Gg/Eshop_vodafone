package stepDefinitions;

import ConfigReader.DriverFactory;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class EshopSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    LoginPage mylogin = new LoginPage(driver);


    @Given("user opens the Vodafone eShop homepage")
    public void user_opens_homepage() {
        driver.get("https://eshop.vodafone.com.eg/en/");
    }

    @When("user adds a product to the cart from homepage")
    public void add_product_from_homepage() {
        mylogin.login();
        homePage.chooseFirstItem();
    }

    @Then("the product should be added to the cart successfully")
    public void verify_product_in_cart()  {
        homePage.isItemAdded();
    }


    @Given("User open the website")
    public void user_at_the_home_page() {
        driver.get("https://eshop.vodafone.com.eg/en/");

    }
    @When("User add the second product to cart")
    public void user_add_the_second_product_to_cart() {

        homePage.chooseSecondItem();
    }

    @Then("item added to the cart successfully")
    public void item_added_to_the_cart_successfully(){
        homePage.isItemAdded();

    }

    @Given("User in page of shopping")
    public void user_in_page_of_shopping() {
        driver.get("https://eshop.vodafone.com.eg/en/");

    }
    @When("User searched for third product to cart")
    public void user_searched_for_third_product_to_cart() {
        homePage.choosethirdItem();

    }
    @Then("the third item added to the cart")
    public void the_third_item_added_to_the_cart() {
        homePage.isItemAdded();


    }

}

