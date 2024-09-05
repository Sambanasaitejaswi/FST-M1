package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net");
        String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        System.out.println(driver.getTitle());
        //login
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title of the page: " + driver.getTitle());
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
        System.out.println("Logged into training page");
        driver.quit();
}
}
