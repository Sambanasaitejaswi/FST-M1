package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Java_Activity12 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        WebElement textField = driver.findElement(By.xpath("//*[@id = 'dynamicText']/input"));
        System.out.println("Text Field is :  "+textField.isEnabled());

        WebElement enableInputBtn = driver.findElement(By.xpath("//*[@id = 'toggleInput']"));
        enableInputBtn.click();

        System.out.println("Text Field is :  "+textField.isEnabled());
        driver.close();
    }
}
