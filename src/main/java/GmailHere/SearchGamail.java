package GmailHere;


import WebDriver.AbstractPage;
import WebDriver.WebDriverContext;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchGamail extends AbstractPage {

    private WebDriver driver;
    @FindBy(xpath = "//*[@type='email']")
    private WebElement GmailInput;

    @FindBy(id = "identifierNext")
    private WebElement ClickBotton;

    @FindBy(name = "password")
    private WebElement PasswordName;

    @FindBy(id = "passwordNext")
    private WebElement ClickBottonYet;
    @FindBy(xpath = "//*[@name='q']")
    private WebElement Search;

    @FindBy(name = "q")
    private WebElement text;


    @Step("Typeing gmail[{Name}]")
    public void setFirstGmail(final String Name) {
        GmailInput.sendKeys(Name);

    }
    @Step("Click")
    public void setClickBotton() {

        ClickBotton.click();
    }

    @Step("Typeing Passwords")
    public void setPassword(final String Name) {
        PasswordName.sendKeys(Name);

    }

    @Step("Click")
    public void setClickBottonYet() {
        ClickBottonYet.click();
    }




    @Step("Typeing text and find")
    public void setSearch(String item) {

        Search.sendKeys(item);
    }


    public String getText(){
        return text.getText();
    }

}