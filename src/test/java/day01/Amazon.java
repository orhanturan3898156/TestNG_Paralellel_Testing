package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.*;

public class Amazon {

    WebDriver driver; //my driver123456



    @Test
    public void amazonTest() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
        Select option = new Select(dropDown);
        System.out.println(option.getFirstSelectedOption().getText());

        // dropDown.click();
        // option.selectByIndex(3);
        System.out.println(option.getOptions().get(3).getText());

        List<WebElement> listofWebElements = option.getOptions();
        for (int i = 0; i < listofWebElements.size(); i++) {
            System.out.println(option.getOptions().get(i).getText());
        }


        for (int i = 0; i < listofWebElements.size(); i++) {
            if (listofWebElements.get(i).getText().equals("Appliances")) {
                System.out.println(true);
            }
        }

        WebElement appliances = driver.findElement(By.xpath("//option[.='Appliances']"));
        Assert.assertTrue(appliances.isDisplayed());


        List<String> list = new ArrayList<String>();
        for (WebElement each : listofWebElements) {
            list.add(each.getText());
        }
        System.out.println(list);

        System.out.println("==================");

        List<String> list2 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }

        Collections.sort(list2);
        System.out.println(list2);

        System.out.println("==================");


        Assert.assertEquals(list,list2);

    }


    @AfterMethod
    public void close() {
        driver.close();
    }


}
