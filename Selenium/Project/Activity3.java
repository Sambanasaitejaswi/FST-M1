package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity3 {
    WebDriver driver;

    @BeforeTest
    public void driversetUp() {
        // Set up the Geeko Driver
        WebDriverManager.firefoxdriver().setup();
        // Initialize Firefox
        driver = new FirefoxDriver();
        //Open the page
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void jobspage(){
        WebElement image= driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //String imageurl=image.getAttribute("src");
        System.out.println("URL of the header image "+ image.getAttribute("src"));
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

