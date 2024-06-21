import com.google.j2objc.annotations.Weak;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Enabled;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void driverSetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");

    }
    @Test
        public void title(){
            String Tqitle = driver.getTitle();
            System.out.println("Title of the page " + Tqitle);
        Assert.assertEquals(Tqitle,"Target Practice");

        }
    @Test
    public void element(){
    WebElement ButtonElement =driver.findElement(By.cssSelector("button.black"));
    Assert.assertTrue(ButtonElement.isDisplayed());
        Assert.assertEquals(ButtonElement.getText(),"black");
    }
   @Test(enabled = false)
    public void Skipenable(){
       String subHeading = driver.findElement(By.className("sub")).getText();
       Assert.assertTrue(subHeading.contains("Practice"));
   }
   @Test
   public void SkipExce()
   {
       throw new SkipException("Skipping test case");
   }
    @AfterClass
            public void tearDown () {
                driver.quit();
            }


}
