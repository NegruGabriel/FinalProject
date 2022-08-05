package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnSeleniumPage {
    @FindBy(xpath = "/html/body/a")
    private WebElement returnButton;

    public LearnSeleniumPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void clickOnReturnButton() {
        returnButton.click();
    }
}
