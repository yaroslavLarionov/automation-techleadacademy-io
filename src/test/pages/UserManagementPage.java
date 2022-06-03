package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage extends BasePage {
    protected WebDriver driver;

    public UserManagementPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Access DB")
    public WebElement accessDbBtn;

    public String expectedTitle = "User DB";


}
