package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Activity9 {
    WebDriver driver;

    @BeforeTest
    public void driversetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-login.php?loggedout=true&wp_lang=en_US");
    }

    @Test(priority = 0)
    public void login() {
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys(" pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
    }

    @Test(priority = 1)
    public void jobListing() {
        driver.navigate().to("https://alchemy.hguy.co/jobs/wp-admin/edit.php?post_type=job_listing");
        //driver.navigate().to("https://alchemy.hguy.co/jobs/wp-admin/edit.php?post_type=job_listing);
        System.out.println("Clicked on joblisting");
       // driver.findElement(By.linkText("Add New")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Add New')])[7]")).click();
        System.out.println("Clicked on add neww");
        //post-title-0
        //   Thread.sleep(5000);
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        subWindowHandler = iterator.next();
        driver.switchTo().window(subWindowHandler);

        String str22=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[2]/div[1]/p")).getText();
        System.out.println(str22);
        driver.switchTo().window(parentWindowHandler);
        driver.findElement(By.xpath("//input[@name='_job_location']")).sendKeys("Banglore");
        driver.findElement(By.xpath("//input[@name='_application']")).sendKeys("abhiram@cklabs.com");
        driver.findElement(By.xpath("//input[@name='_company_name']")).sendKeys("IBM");
        driver.findElement(By.xpath("//input[@name='_company_website']")).sendKeys("https://lms.training-support.net/alchemy/wp-content/uploads/sites/2/2021/02/Project-JOB-BOARD-Version-2.pdf");
        driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary']")).click();
        //driver.findElement(By.cssSelector(".editor-post-publish-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
