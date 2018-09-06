package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExamplePage extends BasePage {
    private static final PageElement userNameField = new PageElement(
            "Username field",
            By.id("sampleOfId"),
            true);
    private static final PageElement passwordField = new PageElement(
            "Password field",
            By.id("sampleOfId"),
            true);
    private static final PageElement sumbitButton = new PageElement(
            "Submit button",
            By.id("sampleOfId"),
            true);


    public ExamplePage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed(){
        return allRequiredElementDisplayed();
    }

   private void fillUsername(String username){
        enterText(userNameField,username);
   }

   private void fillPassword(String password){
       enterText(passwordField,password);
   }

   private void clickSubmitButton(){
       click(sumbitButton);
   }

   public void makeLogIn(String username, String password){
       fillUsername(username);
       fillPassword(password);
       clickSubmitButton();
   }
}