package PageObjects;

import org.example.Utils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class MainPage {
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructors;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorsHeader;

    @FindBy(xpath ="html/body/section[1]/div/div/div/a" )
    private  WebElement enrollmentButton;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;

    @FindBy(xpath ="/html/body/section[2]/div/div/div/input")
    private WebElement newsletterTextBox;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath ="/html/body/section[3]/div/div/div[3]/div/div/a" )
    private WebElement readMoreForInPersonLink;

    @FindBy(xpath ="//section[@class='p-5'][1]" )
    private WebElement coursesTypesSection;

    @FindBy(xpath = "/html/body/h1")
    private  WebElement inPersonHeader;
    @FindBy(xpath ="/html/body/section[3]/div/div/div[2]/div/div/a" )
    private WebElement readMoreForHybridLink;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private  WebElement readMoreForVirtualLink;

    private WebDriver driver;
    private AbstractButton hybridHeader;


    public MainPage(WebDriver driver) {
        this.driver=driver;
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
        return this.personalInformationHeader.getText();
    }

    public void writeEmailInNewsletterTextBox(String email){
        newsletterTextBox.sendKeys(email);
    }

    public void clickOnSubmit(){
        submitButton.click();
    }

    public boolean isNewsletterTextBoxWithError() {
        String classCss = this.newsletterTextBox.getAttribute("class");
        return "form-control error".equals(classCss);
    }

    public boolean popUpAppears() {
        try{
            this.driver.switchTo().alert();
            // If it reaches here, it found a popup
            return true;
        } catch(NoAlertPresentException e){
            return false;
        }
    }

    public void clickOnReadMoreForInPerson() {
        Utils.scrollToElement(driver, coursesTypesSection);
        readMoreForInPersonLink.click();
    }

    public String getInPersonHeader() {
        return this.inPersonHeader.getText();
    }


    public void clickOnReadMoreForHybrid() {
        Utils.scrollToElement(driver,coursesTypesSection);
        readMoreForHybridLink.click();
    }

    public String getHybridHeader() {
        return this.hybridHeader.getText();
    }

    public void clickOnReadMoreForVirtual() {
        Utils.scrollToElement(driver,coursesTypesSection);
        readMoreForVirtualLink.click();
    }
}
