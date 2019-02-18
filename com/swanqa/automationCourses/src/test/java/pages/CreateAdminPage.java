package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAdminPage extends BasePage {

    private static final PageElement firstNameField = new PageElement(
            "First Name Field",
            By.id("FirstName"),
            true);
    private static final PageElement lastNameField = new PageElement(
            "Last Name Field",
            By.id("LastName"),
            true);
    private static final PageElement emailField = new PageElement(
            "Email address Field",
            By.id("Email"),
            true);
    private static final PageElement usernameField = new PageElement(
            "Username Field",
            By.id("UserName"),
            true);
    private static final PageElement passwordField = new PageElement(
            "Password Field",
            By.id("Password"),
            true);
    private static final PageElement confirmPasswordField = new PageElement(
            "Confirm Password Field",
            By.id("ConfirmPassword"),
            true);
    private static final PageElement superCheckbox = new PageElement(
            "Super Checkbox",
            By.xpath("//span[contains(text(), 'Super')]"),
            true);
    private static final PageElement saveButton = new PageElement(
            "Save Button",
            By.id("btnSave"),
            true);

    public CreateAdminPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed() {
        return allRequiredElementDisplayed();
    }

    public void fillAdminRequiredFields(String cv_AdminFirstName, String cv_AdminLastName, String cv_AdminEmail, String cv_AdminUsername, String cv_AdminPassword, String cv_AdminConfirmPassword){
        enterText(firstNameField, cv_AdminFirstName);
        enterText(lastNameField, cv_AdminLastName);
        enterText(emailField, cv_AdminEmail);
        enterText(usernameField, cv_AdminUsername);
        enterText(passwordField, cv_AdminPassword);
        enterText(confirmPasswordField, cv_AdminConfirmPassword);
        click(superCheckbox);
    }

    public void createAdmin(){
        waitToBeClickable(saveButton);
        click(saveButton);
    }

}
