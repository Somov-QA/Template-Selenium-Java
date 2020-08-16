package Support.StepObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSteps {
    public final WebDriver driver;

    public GoogleSteps(WebDriver webdriver) {
        driver = webdriver;
    }

    public GoogleSteps setValueInSearch(String value, String nameField) {
        By searchField = By.name(nameField);
        WebElement search = driver.findElement(searchField);
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
        return this;
    }

    public int getCountResultSearch(String classResults)
    {
        By searchResult = By.className(classResults);
        List<WebElement> elements = driver.findElements(searchResult);
        return elements.size();
    }
}
