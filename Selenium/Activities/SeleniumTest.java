package Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //Installing the Geckodriver
        WebDriverManager.firefoxdriver().setup();
        //Create the webdriver object
        WebDriver driver = new FirefoxDriver();
        //open a page
        driver.get("https://v1.training-support.net/");
        //print page title
        System.out.println("Page title :" + driver.getTitle());
        //print the heading text
        String header1 = driver.findElement(By.cssSelector("h1.ui.header")).getText();
        System.out.println("Page heading:" + header1);
        //Find and click the about us link
        driver.findElement(By.id("about-link"));
        driver.findElement(By.linkText("About Us")).click();
       // driver.findElement(By.xpath("//input:[@id=action-confirmation]"));

        //close the browser
        driver.quit();

    }
}
