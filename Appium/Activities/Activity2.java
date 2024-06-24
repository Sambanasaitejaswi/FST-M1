package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    //Driver declaraion
    AndroidDriver driver;

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
        driver.get("https://www.trainig-support.net");
        //Thread.sleep(1000);

    }

    @Test
    public void heading() {
        String pageheading = driver.findElement(AppiumBy.xpath("//android.view.View[@text='Training Support']")).getText();
        System.out.println(pageheading);
        driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']")).click();
        String secondheading = driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']")).getText();
        System.out.println(secondheading);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
