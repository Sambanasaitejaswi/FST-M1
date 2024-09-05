package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

@BeforeTest
public void driversetup(){
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    driver.get("https://alchemy.hguy.co/jobs/");
    }

@Test
public void secondheading(){
    WebElement heading2=driver.findElement(By.tagName("h2"));
  String  heading2text=heading2.getText();
    System.out.println("Heading2 is "+ heading2text);
    if (heading2text.equalsIgnoreCase("Quia quis non")){
        System.out.println("Heading matches");
    }
    else {
        System.out.println("second heading not matched");
    }
}
@AfterTest
public void teardown(){
    driver.quit();
}
}
