package Support.StepObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSteps {
    private final WebDriver _driver;

    public GoogleSteps(WebDriver driver) {
        _driver = driver;
    }

    public GoogleSteps setValueInSearch(String value, String nameField) {
        By searchField = By.name(nameField);
        WebElement search = _driver.findElement(searchField);
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
        return this;
    }

    public int getCountResultSearch(String classResults)
    {
        By searchResult = By.className(classResults);
        List<WebElement> elements = _driver.findElements(searchResult);
        return elements.size();
    }
}
