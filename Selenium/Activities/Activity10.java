package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String title=driver.getTitle();
        System.out.println(title);
       boolean dynamiccheckbox= driver.findElement(By.id("dynamicCheckbox")).isDisplayed();
       System.out.println(dynamiccheckbox);
      driver.findElement(By.id("toggleCheckbox")).click();
        boolean checkbox= driver.findElement(By.id("dynamicCheckbox")).isDisplayed();
        System.out.println(checkbox);
       driver.quit();

    }
}
