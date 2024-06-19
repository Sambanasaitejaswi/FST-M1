package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
   WebDriver driver;

   @BeforeClass
    public void setUp(){
       WebDriverManager.firefoxdriver().setup();
       driver = new FirefoxDriver();
       driver.get("https://v1.training-support.net");
   }

   @Test(priority = 1)
    public void homepageTest(){
       Assert.assertEquals(driver.getTitle(), "Training Support");
       driver.findElement(By.id("about-link")).click();
   }

   @Test(priority = 2)
    public void aboutPageTest(){
       Assert.assertEquals(driver.getTitle(), "About Training Support");
   }

   @AfterClass
    public void tearDown(){
       driver.quit();
   }
}
