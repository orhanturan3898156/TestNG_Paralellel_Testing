package Package2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pack23 {
    WebDriver driver;

    @Test(groups = {"smoke", "regression"})
    public void test1() {
        System.out.println("test1");
    }

    @Test(groups = {"regression"})
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void appleTest() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.apple.com/iphone/");


    }
}
