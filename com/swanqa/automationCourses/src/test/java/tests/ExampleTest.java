package tests;

import common.Config;
import common.dataObjects.ExampleDataObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest extends BaseTest {

    @Test(description = "Login with Valid Credentials")
    public void loginWithValidCredentials(){
        driver.get(Config.BASE_URL_ONE);
        Assert.assertTrue(examplePage.pageIsDisplayed(), "Login page should be displayed");
        examplePage.makeLogIn(Config.USERNAME, Config.PASSWORD);
        Assert.assertTrue(exampleDashboardPage.pageIsDisplayed(), "Dashboard page should be displayed");
    }

    @Test(description = "Create User", priority = 1)
    public void createUser(){
        ExampleDataObject exampleDataObject = new ExampleDataObject();
        driver.get(Config.BASE_URL_ONE);
        Assert.assertTrue(examplePage.pageIsDisplayed(), "Login page should be displayed");
        examplePage.makeLogIn(Config.USERNAME, Config.PASSWORD);
        Assert.assertTrue(exampleDashboardPage.pageIsDisplayed(), "Dashboard page should be displayed");
        Assert.assertTrue(exampleAddNewUserPage.pageIsDisplayed(), "User page should be displayed");
        exampleWorkflow.createNewUser(exampleDataObject);
    }

}
