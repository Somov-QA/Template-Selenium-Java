package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GoogleSearchPage;

public class Test2
{
    private static WebDriver driver;

    @BeforeClass
    public static void setup()
    {
        String path =  System.getProperty("user.dir") + "\\webdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void testSearch()
    {
        GoogleSearchPage page = new GoogleSearchPage(driver);
        page.setValueInSearch("GeForce 1650");
        Assert.assertNotEquals(0, page.getCountResultSearch());
    }

    @AfterClass
    public static void tearDown()
    {
        driver.close();
    }

}
