package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity16 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Homepage Title:" + title);
        WebElement userName=driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        WebElement password=driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement confirmPassword=driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        WebElement emaiL =driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        userName.sendKeys("Saitejaswi");
        password.sendKeys("qwerty");
        confirmPassword.sendKeys("qwerty");
        emaiL.sendKeys("Saitejaswists@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        String loginMessage=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(loginMessage);
        driver.quit();

    }
}
