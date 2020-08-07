package tests.acceptance;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import Support.Helper.Selenium;
import Support.PageObjects.GooglePage;
import Support.StepObjects.GoogleSteps;


public class TestSampleJUnit {
    @BeforeClass
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

    @AfterClass
    public static void tearDown() {
        Selenium.quitWebDriver();
    }
}
