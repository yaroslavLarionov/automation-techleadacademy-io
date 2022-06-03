package tests;

import base.BaseTest;
import data.dataProviders.DataProviders;
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

    @Test (testName = "US-03", description = "Verify new user is created in DB", dataProvider = "Role info", dataProviderClass = DataProviders.class)
    public void test03(String firstName, String lastName, String phone, String email, String role) {
        homePage.userMgtBtn.click();
        //create new user information
        userManagementPage.firstNameEl.sendKeys(firstName);
        userManagementPage.lastNameEl.sendKeys(lastName);
        userManagementPage.phoneNumberEl.sendKeys(phone);
        userManagementPage.emailEl.sendKeys(email);
        userManagementPage.roleID.sendKeys(role);
        //click submit the info for each user and then click submit the table
        userManagementPage.submitBtn.click();
        userManagementPage.submitTableBtn.click();
        //access the DB, make a screenshot and verify the user is there
        userManagementPage.accessDbBtn.click();
        seleniumUtils.switchToNextWindow(getDriver());
        userManagementPage.waitForElementVisibility(userManagementPage.lastRow);
        userManagementPage.moveIntoView(userManagementPage.lastRow);
        extentManager.logScreenshot();
        Assert.assertTrue(userManagementPage.lastRow.getText().contains(firstName) &&
                        userManagementPage.lastRow.getText().contains(lastName) &&
                        userManagementPage.lastRow.getText().contains(phone) &&
                        userManagementPage.lastRow.getText().contains(email) &&
                        userManagementPage.lastRow.getText().contains(role));

    }


}
