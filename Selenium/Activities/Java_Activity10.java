package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Java_Activity10 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        //Create WebDriver Object
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions builder = new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement checkbox = driver.findElement(By.className("willDisappear"));
        // Find the toggle button and click it
        WebElement checkboxToggle = driver.findElement(By.id("toggleCheckbox"));
        checkboxToggle.click();
        // Wait for the checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        // Click the button again
        checkboxToggle.click();
        // Wait for the element to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        // Click the checkbox
        driver.findElement(By.xpath("//input[@class='willDisappear']")).click();

        // Close the browser
        driver.close();
    }
}
