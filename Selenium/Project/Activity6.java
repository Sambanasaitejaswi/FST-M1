package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity6 {
    WebDriver driver;

    @BeforeTest
    public void driversetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Open browser with Alchemy site
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void applyJob() {
        //Navigate to Alchemy Jobs site
        driver.navigate().to("https://alchemy.hguy.co/jobs/jobs/");
        //Searching for a particular job
        WebElement searchKeyword = driver.findElement(By.id("search_keywords"));
        //sending input
        searchKeyword.sendKeys("Banking");
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        // driver.findElement(By.tagName("input")).click();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[@class='post-7820 job_listing type-job_listing status-publish hentry job-type-full-time']")).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='button']"));
        driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
        String emailid = driver.findElement(By.linkText("san@gmail.com")).getText();
        System.out.println("Email is " + emailid);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
