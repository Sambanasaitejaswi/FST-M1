package project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static activities.ActionBase.doSwipe;

public class Activity4 {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Set the desired capabilities

        UiAutomator2Options caps = new UiAutomator2Options()
                .setPlatformName("android")
                .setAutomationName("UIAutomator2")
                .setAppPackage("com.android.chrome")
                .setAppActivity("com.google.android.apps.chrome.Main")
                .noReset();


        //Set the appium severURL
        URL serverUrl= new URL("http://localhost:4723/wd/hub");

        //Initialize the android driver
        driver = new AndroidDriver(serverUrl, caps);

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://v1.training-support.net/selenium");
    }

    @Test
    public void webAppTest() throws InterruptedException{
//        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text='Get Started!']")));
        Dimension dims = driver.manage().window().getSize();
        Point start = new Point((int)(dims.getWidth()* 0.5), (int)(dims.getHeight()*0.8));
        Point end = new Point((int)(dims.getWidth()* 0.5), (int)(dims.getHeight()*0.6));

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text='Get Started!']")));
        doSwipe(driver, start, end, 50);

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.view.View[contains(@text,'To-Do List')]"))).click();
//        driver.findElement(AppiumBy.xpath("//android.view.View[contains(@text,'To-Do List')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']"))).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']")).sendKeys("Task 1 added");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@resource-id='tasksList']/android.view.View")));
        List<WebElement> numberofTasks = driver.findElements(AppiumBy.xpath("//android.view.View[@resource-id='tasksList']/android.view.View"));

        Assert.assertEquals(numberofTasks.size(),2);

    }

//    @AfterClass
//    public void tearDown(){
//        driver.close();
//    }
}
