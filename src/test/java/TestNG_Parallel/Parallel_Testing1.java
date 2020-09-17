package TestNG_Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel_Testing1 {
    WebDriver driver;


    @Test
    public void logoTest() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);

    }

    @Test
    public void homePageTitle() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }


}

