package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;

    @BeforeTest
    public void driversetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Open browser with Alchemy site
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void postJob() {
        driver.navigate().to("https://alchemy.hguy.co/jobs/post-a-job/");
        System.out.println("Navigated to Post a job page");
        driver.findElement(By.id("create_account_email")).sendKeys("Saitejaswists@gmail.com");
        driver.findElement(By.id("job_title")).sendKeys("Test Specialist");
        driver.findElement(By.id("job_location")).sendKeys("Hyderabad");
        driver.findElement(By.id("mceu_16")).sendKeys("To ensure that their company’s software products are as effective and glitch-free as possible, Testers perform a variety of tasks. We analyzed several online job listings to identify these key duties and responsibilities.");
        driver.findElement(By.id("application")).sendKeys("https://alchemy.hguy.co/jobs/post-a-job/");
        driver.findElement(By.name("company_name")).sendKeys("IBM");
        driver.findElement(By.name("submit_job")).click();
        System.out.println("Clicked on preview");
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        System.out.println("Submit the job details");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
