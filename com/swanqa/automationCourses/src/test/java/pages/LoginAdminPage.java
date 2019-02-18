package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAdminPage extends BasePage {

    private static final PageElement usernameField = new PageElement(
            "Username Field",
            By.id("username"),
            true);
    private static final PageElement passwordField = new PageElement(
            "Password Field",
            By.id("password"),
            true);
    private static final PageElement signinButton = new PageElement(
            "Signin Button",
            By.xpath("//input[@type='submit']"),
            true);


    public LoginAdminPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed() {
        return allRequiredElementDisplayed();
    }

    public void fillUsername(String username){
        waitToBeVisible(usernameField);
        enterText(usernameField, username);
    }

    public void fillPassword(String password){
        waitToBeVisible(passwordField);
        enterText(passwordField, password);
    }

    public void makeLoginAdmin(String username, String password){
        fillUsername(username);
        fillPassword(password);
        click(signinButton);
    }


}
