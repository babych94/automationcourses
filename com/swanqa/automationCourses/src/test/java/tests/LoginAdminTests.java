package tests;

import common.Config;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginAdminTests extends BaseTest {
    @Test(description = "Make login", priority = 0)
    public void makeAdminLogin(){
        driver.get(Config.BASE_URL_ADMIN);
        Assert.assertTrue(loginAdminPage.pageIsDisplayed(), "Admin Login page should be displayed");
        loginAdminPage.makeLoginAdmin(Config.USERNAME, Config.PASSWORD);
        Assert.assertTrue(welcomePage.pageIsDisplayed(), "Welcome page should be displayed");
        welcomePage.takeScreenshot("WelcomePage");
    }

    @Test(description = "Admin creation", priority = 1)
    public void adminCreation(){
        driver.get(Config.BASE_URL_ADMIN);
        Assert.assertTrue(loginAdminPage.pageIsDisplayed(), "Admin Login page should be displayed");
        loginAdminPage.makeLoginAdmin(Config.USERNAME, Config.PASSWORD);
        Assert.assertTrue(welcomePage.pageIsDisplayed(), "Welcome page should be displayed");
        welcomePage.openAdminManagementPage();
        Assert.assertTrue(adminManagementPage.pageIsDisplayed(), "Admin Management page should be displayed");
        adminManagementPage.clickCreateAdmin();
        Assert.assertTrue(createAdminPage.pageIsDisplayed(), "Create Admin page should be displayed");
        createAdminPage.fillAdminRequiredFields(Config.CV_FIRST_NAME, Config.CV_LAST_NAME, Config.CV_EMAIL, Config.CV_USERNAME, Config.CV_TEMPORARY_PASSWORD, Config.CV_CONFIRM_TEMPORARY_PASSWORD);
        createAdminPage.createAdmin();
        Assert.assertTrue(adminManagementPage.pageIsDisplayed(), "Admin Management page should be displayed");
    }

    @Test(description = "Admin change temporery password", priority = 2)
    public void adminChangeTemporaryPassword(){
        driver.get(Config.BASE_URL_ADMIN);
        Assert.assertTrue(loginAdminPage.pageIsDisplayed(), "Admin Login page should be displayed");
        loginAdminPage.makeLoginAdmin(Config.CV_USERNAME, Config.CV_TEMPORARY_PASSWORD);
        Assert.assertTrue(changeYourPasswordPage.pageIsDisplayed(), "Change Your Password page should be displayed");
        changeYourPasswordPage.fillAllChangePasswordFields(Config.CV_TEMPORARY_PASSWORD, Config.CV_PASSWORD, Config.CV_PASSWORD);
        changeYourPasswordPage.clickChangeButton();
        Assert.assertTrue(welcomePage.pageIsDisplayed(), "Welcome page should be displayed");
    }


    @AfterMethod
    public void adminLogout(){
        welcomePage.makeLogout();
        Assert.assertTrue(loginAdminPage.pageIsDisplayed());
    }

}
