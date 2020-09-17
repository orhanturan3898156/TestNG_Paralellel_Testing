package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Apple {

    public static WebDriver driver;


    @BeforeMethod
    @Parameters("browsers")
    public void setUp(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("invalid browser");
        }


    }

    @Test
    public void apple1() {

        driver.get("https://www.apple.com/");
    }

    @Test
    public void apple2() {
        driver.get("https://www.samsung.com/us/");

    }


    //@AfterMethod
    public void close() {

        driver.close();
    }
    /*

     */


}
