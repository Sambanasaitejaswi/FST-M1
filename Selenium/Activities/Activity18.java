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

public class Activity18 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/selects");

        System.out.println("Home page title: " + driver.getTitle());
        // Store the select and make a new select object
        WebElement selectDropdown = driver.findElement(By.id("multi-select"));
        Select select = new Select(selectDropdown);
        select.selectByVisibleText("Javascript");
        for (int i = 4; i <= 6; i++) {
            select.selectByIndex(i);
        }
        select.selectByValue("node");
        // Print the selected options
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        select.deselectByIndex(5);
        // Print the selected options
        selectedOptions = select.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        driver.quit();
    }
}