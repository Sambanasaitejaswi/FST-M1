package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Java_Activity4 {
    public static void main(String[] args){
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");

        System.out.println("Title of page is: "+driver.getTitle());

        String thirdHeader = driver.findElement(By.xpath("//h3[@id = 'third-header']")).getText();
        System.out.println("Third Header is: "+thirdHeader);

        String fifthHeaderColor = driver.findElement(By.xpath("//h5[text() = 'Fifth header']")).getCssValue("color");
        System.out.println("Fifth Header color is: "+fifthHeaderColor);

        String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);

        String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println(greyButtonText);
    }
}
