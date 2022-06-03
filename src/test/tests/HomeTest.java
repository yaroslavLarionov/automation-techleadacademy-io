package tests;

import base.BaseTest;
import data.dataProviders.DataProviders;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {
    HomePage homePage;
    SeleniumUtils seleniumUtils;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        seleniumUtils = new SeleniumUtils();
    }

    @Test (testName = "US-01", description = "Verify the links of expected pages", dataProvider = "buttonNames", dataProviderClass = DataProviders.class)
    public void test01(String btnText, String expectedTitle) {
        getDriver().findElement(By.linkText(btnText)).click();
        seleniumUtils.switchToNextWindow(getDriver());
        extentManager.logScreenshot();
        Assert.assertEquals(getDriver().getTitle(), expectedTitle);
    }

}
