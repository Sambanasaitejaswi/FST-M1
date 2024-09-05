package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[]args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title of the page is: "+driver.getTitle());
        String thirdHeader= driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        //third header
        System.out.println("Third header is "+thirdHeader);
        String fifthHeader=driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        //fifthe header
        System.out.println("Fifth header color is "+fifthHeader);
        //violet button
        String Violetbutton=driver.findElement(By.xpath("//button[@class='ui violet button']")).getAttribute("class");
        System.out.println("class of violet"+Violetbutton);
        String Grey=driver.findElement(By.xpath("//button[@class='ui grey button']")).getText();
        System.out.println("text of Grey"+Grey);
        driver.close();


    }
}
