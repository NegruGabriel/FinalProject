package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualPage {

    @FindBy(xpath = "/html/body/a")
    private WebElement returnButton;

    public VirtualPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnReturnButton() {
        returnButton.click();
    }
}
