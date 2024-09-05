package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Homepage Title:" + title);
        WebElement userName=driver.findElement(By.xpath("//input[starts-with(@class,'username-')]"));
        WebElement password=driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
        userName.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String loginMessage=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(loginMessage);
        driver.quit();


    }
}
