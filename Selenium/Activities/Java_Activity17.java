package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Java_Activity17 {
    public static void main(String[] args){

        WebDriverManager.firefoxdriver().setup();
        //Create WebDriver Object
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Title of page is: "+driver.getTitle());

        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        select.selectByIndex(3);
        select.selectByValue("4");
        


    }
}
