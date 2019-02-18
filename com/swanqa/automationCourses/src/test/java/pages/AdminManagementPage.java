package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminManagementPage extends BasePage {
    private static final PageElement createAdminButton = new PageElement(
            "Create Admin Button",
            By.id("btnCreateAdmin"),
            true);

    public AdminManagementPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed() {
        return allRequiredElementDisplayed();
    }

    public void clickCreateAdmin(){
        waitToBeClickable(createAdminButton);
        click(createAdminButton);
    }
}
