package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
public static void main(String[] args){
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver=new FirefoxDriver();
    driver.get("https://v1.training-support.net/selenium/login-form");
    System.out.println("Title of the page: " + driver.getTitle());
    driver.findElement(By.name("Username")).sendKeys("admin");
    driver.findElement(By.name("Password")).sendKeys("password");
    driver.findElement(By.xpath("//button[@class='ui button']")).click();
            System.out.println("Logged into training page");
    driver.quit();
}
}
