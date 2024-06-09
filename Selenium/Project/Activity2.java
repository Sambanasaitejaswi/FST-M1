package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
@BeforeTest
public void driversetup(){
    // Installing Geeko Driver
    WebDriverManager.firefoxdriver().setup();

    driver = new FirefoxDriver();

    driver.get("https://alchemy.hguy.co/jobs/");

}
@Test
public void heading1(){
            String heading = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
            System.out.println(heading);
            if ( heading.equalsIgnoreCase("Welcome to Alchemy Jobs") ){
                // Close the Browser
                System.out.println("Page Heading matches, Close the browser");
            }
            else {
                System.out.println("Page heading doesn't matches");
            }
        }
@AfterTest
public void teardown(){
    driver.quit();
}

}


