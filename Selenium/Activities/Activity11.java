package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Homepage Title:" +title);
      WebElement box= driver.findElement(By.xpath("//input[@class='willDisappear']"));
        System.out.println("Checkbox is selected " +box.isSelected());
        box.click();
      System.out.println("Checkbox is selected " +box.isSelected());
      driver.quit();
    }
}
