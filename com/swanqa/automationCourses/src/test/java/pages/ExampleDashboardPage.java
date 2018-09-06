package pages;

import common.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExampleDashboardPage extends BasePage {
    private static final PageElement menuFirstButton = new PageElement(
            "Menu first",
            By.id("sampleOfId"),
            true);
    private static final PageElement menuSecondButton = new PageElement(
            "Password field",
            By.id("Menu second"),
            true);
    private static final PageElement menuThirdButton = new PageElement(
            "Menu third",
            By.id("sampleOfId"),
            true);


    public ExampleDashboardPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean pageIsDisplayed(){
        return allRequiredElementDisplayed();
    }

}