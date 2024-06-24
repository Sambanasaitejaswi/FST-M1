package Project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static Activities.W3CActionBase.doSwipe;

public class Activity4 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException, InterruptedException {
        //set the desired capabilities
        UiAutomator2Options caps = new UiAutomator2Options()
                .setPlatformName("android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.chrome")
                .setAppActivity("org.chromium.chrome.browser.customtabs.CustomTabActivity")
                .noReset();
        //Set the appium server URL
        URL serverurl = new URL("http://localhost:4723/wd/hub");


        //Intialize the android driver
        driver = new AndroidDriver(serverurl, caps);

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //open a selenium page
        driver.get("https://www.trainig-support.net/selenium");

    }

    @Test
    public void webAppTest()throws InterruptedException{
        //Get width and height of the screen
        Dimension dims=driver.manage().window().getSize();
        Point start=new Point((int)(dims.getWidth()*0.5),(int)(dims.getHeight()*0.8));
        Point end=new Point((int)(dims.getWidth()*0.5),(int)(dims.getHeight()*0.8));

        //Wait for page to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text='Get Started!']")));

        //scroll(Fling) to the end of the page
        doSwipe(driver,start,end,50);
        //wait for to-do list link and click it
    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
}


