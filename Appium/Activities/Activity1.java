package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    //Driver declaraion
    AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        //set the desired capabilities
        UiAutomator2Options caps=new UiAutomator2Options()
                .setPlatformName("android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.calculator2")
                .setAppActivity(".Calculator")
                .noReset();
        //Set the IOS capabilities
       // XCUITestOptions caps2=new XCUITestOptions()
         //       .setPlatformName("ios")
          //      .setAutomationName("XCUITEST")
           //     .setApp("path/to/.ipaFile")
          //      .noReset();

        //Set the appium server URL
        URL serverurl=new URL("http://localhost:4723/wd/hub");


        //Intialize the android driver
        driver=new AndroidDriver(serverurl,caps);

    }
    @Test
    public void multiply(){
        //find the number 9 and tap it
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_9")).click();

        //find the multiply symbol and tap it
        driver.findElement(AppiumBy.id("com.android.calculator2:id/op_mul")).click();

        //find the number 6 and tap it
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_6")).click();

        //find the = sign and tap it
        driver.findElement(AppiumBy.id("com.android.calculator2:id/eq")).click();

        //Get the result and assert it
        String result=driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
        Assert.assertEquals(result,"54");
    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
