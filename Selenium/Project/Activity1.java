package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {

    WebDriver driver;

    @BeforeTest
    public void  driversetUp(){
        // Set up the Geeko Driver
        WebDriverManager.firefoxdriver().setup();
        // Initialize Firefox
        driver = new FirefoxDriver();
        //Open the page
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test(priority = 1)
    public void TitlepageTest(){
        //Assert Page Title
        Assert.assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application");
        // Find and Click the About Us page
        //driver.findElement(By.id("about-link")).click();
    }

    @AfterTest
    public void tearDown(){
        // close the browser
        driver.quit();
    }

}