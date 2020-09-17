package TestNG_Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3 {


    WebDriver driver;


    @Test
    public void appleTest() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.apple.com/iphone/");


    }

    @Test(groups = {"regression"})
    public void test2(){
        System.out.println("test3");
    }


}
