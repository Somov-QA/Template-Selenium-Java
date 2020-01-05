package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage
{
    public By searchField = By.name("q");
    public By searchResult = By.className("g");
    private final WebDriver _driver;

    public GoogleSearchPage(WebDriver driver)
    {
        _driver = driver;
    }

    public GoogleSearchPage setValueInSearch(String value)
    {
        WebElement search = _driver.findElement(searchField);
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
        return this;
    }

    public int getCountResultSearch()
    {
        List<WebElement> elements = _driver.findElements(searchResult);
        return elements.size();
    }
}
