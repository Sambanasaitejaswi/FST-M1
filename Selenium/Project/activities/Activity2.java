package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setup() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();;
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
    @Test
    public void getURL(){
        WebElement image = driver.findElement(By.xpath("//div[@id = 'divLogo']/img"));
        String src = image.getAttribute("src");
        System.out.println("SRC is---"+src);
    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
