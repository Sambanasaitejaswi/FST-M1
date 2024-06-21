package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args){
        //installing gecko driver
        WebDriverManager.firefoxdriver().setup();
        //Create WebDriver Object
        WebDriver driver = new FirefoxDriver();
        //Open the page
        driver.get("https://v1.training-support.net/");
        //Print the tilte
        System.out.println("Page Title is: "+driver.getTitle());
        driver.findElement(By.cssSelector("h1.ui.header"));
        
        //Close the browser
        driver.quit();
    }
}
