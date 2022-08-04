package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InPersonPage {

    @FindBy(xpath = "/html/body/a")
    private WebElement returnButton;

    public InPersonPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnReturnButton() {
        returnButton.click();
    }
}
