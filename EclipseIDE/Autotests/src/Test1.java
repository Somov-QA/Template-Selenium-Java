import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
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
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("GeForce 1650");
        search.sendKeys(Keys.ENTER);

        Assert.assertTrue(true);
    }

    @AfterClass
    public static void tearDown()
    {
        driver.close();
    }

}
