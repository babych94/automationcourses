package workflow;

import common.dataObjects.ExampleDataObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.ExampleAddNewUserPage;

public class ExampleWorkflow {
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());

    ExampleAddNewUserPage exampleAddNewUserPage;

    public ExampleWorkflow(WebDriver driver){
        this.exampleAddNewUserPage = new ExampleAddNewUserPage(driver);
    }

    public void createNewUser(ExampleDataObject exampleDataObject){
        log.info("Start creating new Admin");
        exampleAddNewUserPage.fillUsernameField(exampleDataObject.UserName);
        exampleAddNewUserPage.fillEmailField(exampleDataObject.Email);
        exampleAddNewUserPage.fillPasswordField(exampleDataObject.Password);
        exampleAddNewUserPage.fillConfirmPassword(exampleDataObject.ConfirmPassword);
        exampleAddNewUserPage.clickSubmitButton();
        log.info("Finish Creating New Admin");
    }
}
