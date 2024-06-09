package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeTest
    public void driversetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void jobspage() {
        driver.navigate().to("https://alchemy.hguy.co/jobs/jobs/");
        System.out.println("Navigated to job page");
      String verifypage =driver.getTitle();
       System.out.println(verifypage);
       if(verifypage.equalsIgnoreCase("Jobs – Alchemy Jobs")){
           System.out.println("You're on the Jobs page");
       }
       else{
           System.out.println("You're not on the Jobs page");
       }
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
