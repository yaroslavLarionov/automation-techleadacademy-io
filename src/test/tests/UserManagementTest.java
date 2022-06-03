package tests;

import base.BaseTest;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserManagementPage;
import utils.SeleniumUtils;

public class UserManagementTest extends BaseTest {
    HomePage homePage;
    UserManagementPage userManagementPage;
    SeleniumUtils seleniumUtils;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        userManagementPage = new UserManagementPage(getDriver());
        seleniumUtils = new SeleniumUtils();
    }

    @Test (testName = "US-02", description = "Verify the title of User-DB page")
    public void test02() {
        homePage.userMgtBtn.click();
        userManagementPage.accessDbBtn.click();
        seleniumUtils.switchToNextWindow(getDriver());
        extentManager.logScreenshot();
        Assert.assertEquals(getDriver().getTitle(), userManagementPage.expectedTitle);
    }


}
