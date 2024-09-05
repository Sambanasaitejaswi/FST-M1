package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity19 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        System.out.println("Home page title: " + driver.getTitle());
        driver.findElement(By.id("confirm")).click();
            wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        System.out.println( alert.getText());
        alert.accept();
        //cancelling alert
        //alert.dismiss();
        driver.quit();
    }
}
