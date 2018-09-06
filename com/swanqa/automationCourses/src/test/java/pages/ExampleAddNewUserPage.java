package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExampleAddNewUserPage extends BasePage {
    private static final PageElement usernameField = new PageElement(
            "Username field",
            By.id("sampleID"),
            true);
    private static final PageElement emailField = new PageElement(
            "Email field",
            By.id("sampleID"),
            true);
    private static final PageElement passwordField = new PageElement(
            "Password field",
            By.id("sampleID"),
            true);
    private static final PageElement confirmPasswordField = new PageElement(
            "Confirm password field",
            By.id("sampleID"),
            true);

    private static final PageElement submitButton = new PageElement(
            "Submit button",
            By.id("sampleID"),
            true);

    public ExampleAddNewUserPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed(){
        return allRequiredElementDisplayed();
    }

    public void fillUsernameField(String strUserName){
        enterText(usernameField, strUserName);
    }


    public void fillEmailField(String strUserName){
        enterText(emailField, strUserName);
    }

    public void fillPasswordField(String strPassword){
        enterText(passwordField, strPassword);
    }

    public void fillConfirmPassword(String strConfirmPassword){
        enterText(confirmPasswordField, strConfirmPassword);
    }

    public void clickSubmitButton(){
        waitToBeClickable(submitButton);
        click(submitButton);
    }
}