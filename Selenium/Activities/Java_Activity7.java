package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Java_Activity7 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        //Create WebDriver Object
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions builder = new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        WebElement football = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        builder.dragAndDrop(football, dropzone1).build().perform();
        builder.clickAndHold(football).moveToElement(dropzone2).release().build().perform();
        driver.quit();

    }
}
