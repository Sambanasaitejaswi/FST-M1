package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();;
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
    }

    @Test
    public void verifyWorkExperience() {
        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));

        username.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@id = 'btnLogin']")).click();
        WebElement myInfo = driver.findElement(By.cssSelector("a#menu_pim_viewMyDetails"));
        myInfo.click();
        WebElement qualification = driver.findElement(By.xpath("//*[@id = 'sidenav']/li/a[text()='Qualifications']"));
        qualification.click();
        WebElement add = driver.findElement(By.xpath("//*[@id = 'addWorkExperience']"));
        add.click();
        WebElement experience = driver.findElement(By.xpath("//*[@id = 'experience_employer']"));
        experience.sendKeys("IBM India");
        WebElement jobTitle = driver.findElement(By.cssSelector("input#experience_jobtitle"));
        jobTitle.sendKeys("Test Specialist");
        driver.findElement(By.xpath("//*[@id = 'btnWorkExpSave']")).click();
    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
