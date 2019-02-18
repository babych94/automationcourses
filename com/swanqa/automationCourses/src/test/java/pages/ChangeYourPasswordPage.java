package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeYourPasswordPage extends BasePage {

    private static final PageElement oldPasswordField = new PageElement(
            "Old Password Field",
            By.id("OldPassword"),
            true);
    private static final PageElement newPasswordField = new PageElement(
            "New Password Field",
            By.id("NewPassword"),
            true);
    private static final PageElement confirmNewPasswordField = new PageElement(
            "Confirm New Password Field",
            By.id("ConfirmNewPassword"),
            true);
    private static final PageElement changeButton = new PageElement(
            "Change Button",
            By.id("btnChange"),
            true);

    public ChangeYourPasswordPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed() {
        return allRequiredElementDisplayed();
    }

    public void fillAllChangePasswordFields(String oldPassword, String newPassword, String confirmNewPassword){
        enterText(oldPasswordField, oldPassword);
        enterText(newPasswordField, newPassword);
        enterText(confirmNewPasswordField, confirmNewPassword);
    }

    public void clickChangeButton(){
        waitToBeVisible(changeButton);
        click(changeButton);
    }
}
