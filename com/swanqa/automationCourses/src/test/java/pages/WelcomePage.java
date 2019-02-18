package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {

    private static final PageElement adminManagementLink = new PageElement(
            "Admin Management Link",
            By.linkText("Admin Management"),
            true);
    private static final PageElement logoutButton = new PageElement(
            "Logout button",
            By.linkText("Logout"),
            true);
    private static final PageElement welcomeLabel = new PageElement(
            "Welcome Label",
            By.xpath("//span[(text() = 'Welcome to the Orpheus Admin Tool')]"),
            true);
    private static final PageElement enrollmentCustomizationLink = new PageElement(
            "Enrollment Customization Link",
            By.linkText("Enrollment Customization"),
            true);

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed() {
        return allRequiredElementDisplayed();
    }

    public void openAdminManagementPage(){
        waitToBeClickable(adminManagementLink);
        click(adminManagementLink);
    }

    public void openEnrollmentCustomizationtPage(){
        waitToBeClickable(enrollmentCustomizationLink);
        click(enrollmentCustomizationLink);
    }

    public void makeLogout(){
        waitToBeVisible(logoutButton);
        click(logoutButton);
    }
}
