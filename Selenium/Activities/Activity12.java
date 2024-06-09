package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Homepage Title:" + title);
        WebElement textfield=driver.findElement(By.id("input-text"));
        System.out.println("Textfield is : " + textfield.isEnabled());
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
        System.out.println("Textfield is : " + textfield.isEnabled());
        driver.quit();
    }
}
