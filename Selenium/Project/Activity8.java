package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;

    @BeforeTest
    public void driversetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-login.php?loggedout=true&wp_lang=en_US");
    }

    @Test(priority = 0)
    public void login() {
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys(" pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
