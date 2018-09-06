package tests;

import common.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.*;
import workflow.*;

public class BaseTest {

    protected ExamplePage examplePage;
    protected ExampleDashboardPage exampleDashboardPage;
    protected ExampleAddNewUserPage exampleAddNewUserPage;
    protected ExampleWorkflow exampleWorkflow;

    public static WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setupTestRun(@Optional("chrome") String browserName){
        driver = new DriverFactory(browserName).getDriver();
        initPages();
    }

    @AfterTest
    public void turnDown(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private void initPages(){
        examplePage = new ExamplePage(driver);
        exampleDashboardPage = new ExampleDashboardPage(driver);
        exampleAddNewUserPage = new ExampleAddNewUserPage(driver);
        exampleWorkflow = new ExampleWorkflow(driver);
    }
}
