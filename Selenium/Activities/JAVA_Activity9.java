package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JAVA_Activity9 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.firefoxdriver().setup();

        //Create WebDriver Object
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/ajax");
        Thread.sleep(3000);
        System.out.println("Title of page is:"+driver.getTitle());
        driver.findElement(By.xpath("//button[@class = 'ui violet button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(text);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"),"I'm late"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);
        driver.quit();
    }
}
