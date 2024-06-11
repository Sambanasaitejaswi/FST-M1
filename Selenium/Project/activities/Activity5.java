package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity5 {
    WebDriver driver;
    @BeforeClass
    public void setup() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();;
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
    }

    @Test
    public void verifyInfo() {
        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));

        username.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@id = 'btnLogin']")).click();
        WebElement myInfo = driver.findElement(By.cssSelector("a#menu_pim_viewMyDetails"));
        myInfo.click();
        driver.findElement(By.xpath("//input[@value = 'Edit']")).click();
        WebElement firstname = driver.findElement(By.xpath("//input[@title= 'First Name']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@title= 'Last Name']"));

        firstname.clear();
        firstname.sendKeys("Jivan");
        lastName.clear();
        lastName.sendKeys("Kajave");
        driver.findElement(By.xpath("//*[@id= 'personal_optGender_1']")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@id= 'personal_cmbNation']")));

        select.selectByVisibleText("Indian");
        WebElement dob = driver.findElement(By.xpath("//input[@id= 'personal_DOB']"));

        dob.sendKeys("1993-09-20");
        driver.findElement(By.xpath("//input[@id= 'btnSave']")).click();
    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
