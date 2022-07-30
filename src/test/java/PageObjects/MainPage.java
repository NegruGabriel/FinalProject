package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructors;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorsHeader;

    @FindBy(xpath ="html/body/section[1]/div/div/div/a" )
    private  WebElement enrollmentButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader.click();

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnInstructors() {
        instructors.click();
    }

    public String getInstructorsHeader(){
        return this.instructorsHeader.getText();
    }

    public void clickOnStartTheEnrollment() {
        this.enrollmentButton.click();
    }



    public String getPersonalInformationHeader() {
        this.personalInformationHeader.click();
    }
}
