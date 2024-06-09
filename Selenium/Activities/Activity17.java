package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://v1.training-support.net/selenium/selects");

        System.out.println("Home page title: " + driver.getTitle());
        // Store the select and make a new select object
        WebElement selectDropdown=driver.findElement(By.id("single-select"));
        Select select=new Select(selectDropdown);


        // Select the second option using visible text
        select.selectByVisibleText("Option 2");
        System.out.println("Second option: " + select.getFirstSelectedOption().getText());
        // Select the third option using index
        select.selectByIndex(3);
        System.out.println("Third option: " + select.getFirstSelectedOption().getText());
        // Select the fourth option using value attribute
        select.selectByValue("4");
        System.out.println("Fourth option: " + select.getFirstSelectedOption().getText());
        // Get all the options inside the select as a list
        List<WebElement> options=select.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : options) {
            System.out.println(option.getText());
        }


        driver.quit();

    }
}

