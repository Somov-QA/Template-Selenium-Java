package tests.acceptance;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import Support.Helper.Selenium;
import Support.PageObjects.GooglePage;
import Support.StepObjects.GoogleSteps;

public class TestSampleTestNG {
    @BeforeTest
    public static void setup() {
        Selenium.initWebDriver();
        Selenium.browserFullScreen();
    }

    @Test
    public void testSearch() {
        Selenium.driver.get("https://www.google.com/");
        GoogleSteps tester = new GoogleSteps(Selenium.driver);
        tester.setValueInSearch("GeForce 1650", GooglePage.inputSearchName);
        int result = tester.getCountResultSearch(GooglePage.searchResultsClass);
        Assert.assertNotEquals(0, result);
        System.out.println("Tests finished: SUCCESS");
    }

    @AfterTest
    public static void tearDown() {
        Selenium.quitWebDriver();
    }
}
