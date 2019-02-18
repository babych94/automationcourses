package tests;

import common.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollmentPreconditionTests extends BaseTest {
    @Test(description = "Enrollment preconditions for enroll End User")
    public void enrollmentPreconditionsForEnrollEndUser(){
        driver.get(Config.BASE_URL_ADMIN);
        Assert.assertTrue(loginAdminPage.pageIsDisplayed(), "Admin Login page should be displayed");
        loginAdminPage.makeLoginAdmin(Config.USERNAME, Config.PASSWORD);
        Assert.assertTrue(welcomePage.pageIsDisplayed(), "Welcome page should be displayed");
        welcomePage.openEnrollmentCustomizationtPage();
        Assert.assertTrue(enrollmentCustomizationPage.pageIsDisplayed(), "Enrollment Customization page should be displayed");
        enrollmentCustomizationPage.clickOnConsumerEnrollmentTab();
        enrollmentCustomizationPage.enrollPreconditions();
        enrollmentCustomizationPage.saveChangesConsumerEnrollmentTab();

    }


}
