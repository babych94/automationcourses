package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnrollmentCustomizationPage extends BasePage {
    private static final PageElement generalSettingsTab = new PageElement(
            "General Settings Tab",
            By.xpath("//span[text()='General Settings']"),
            true);
    private static final PageElement consumerEnrollmentTab = new PageElement(
            "Consumer Enrollment Tab",
            By.xpath("//span[text()='Consumer Enrollment']"),
            true);
    private static final PageElement subuserEnrollmentTab = new PageElement(
            "Subuser Enrollment Tab",
            By.xpath("//span[text()='Subuser Enrollment']"),
            true);
    private static final PageElement convertedUserEnrollmentTab = new PageElement(
            "Converted User Enrollment Tab",
            By.xpath("//span[text()='Converted User Enrollment']"),
            true);
    private static final PageElement identityVerificationOffRadiobutton = new PageElement(
            "Identity Verification Off Radiobutton",
            By.xpath("//input[@id='IdentityVerification_IdentityCheckType' and @value='Off']"),
            false);
    private static final PageElement generalSettingsSaveButton = new PageElement(
            "General Settings Save Button",
            By.xpath("//form[@data-stable-name='Enrollment-GeneralSettings-Form']//button[@type='submit']"),
            false);
    private static final PageElement consumerEnrollmentSaveButton = new PageElement(
            "Consumer Enrollment Save Button",
            By.xpath("//form[@data-stable-name='Enrollment-ConsumerFlow-Form']//button[@type='submit']"),
            false);

    public EnrollmentCustomizationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed() {
        return allRequiredElementDisplayed();
    }

    public void clickOnConsumerEnrollmentTab(){
        waitToBeVisible(consumerEnrollmentTab);
        click(consumerEnrollmentTab);
    }

    public void enrollPreconditions(){
        waitToBeVisible(identityVerificationOffRadiobutton);
        click(identityVerificationOffRadiobutton);
    }

    public void saveChangesConsumerEnrollmentTab(){
        waitToBeVisible(consumerEnrollmentSaveButton);
        click(consumerEnrollmentSaveButton);
    }

}
