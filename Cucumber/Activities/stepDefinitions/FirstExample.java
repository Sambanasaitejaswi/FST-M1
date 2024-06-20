package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExample extends BaseClass {

    @BeforeAll
    public static void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Given("the user is on TS homepage")
    public void openTShomePage(){
        driver.get("https://v1.training-support.net");
        Assertions.assertEquals("Training Support", driver.getTitle());
    }
    @When("the user clicks on the about us link")
    public void clickAboutLink(){
        driver.findElement(By.id("about-link")).click();
    }

    @Then("the user is redirected to the About page")
    public void verifyAboutPage(){
        Assertions.assertEquals("About Training Support", driver.getTitle());
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
