package TestGmail;


import GmailHere.SearchGamail;
import WebDriver.WebDriverContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {
    private static final String LOGIN = "tomasjefferson334@gmail.com";
    private static final String PASSWORD = "tomas2015";

    @Test(description = " Verify ability for user to login into mail box")
    public void setTest() {


        WebDriverContext.loadURL("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        SearchGamail searchGamail = new SearchGamail();


        searchGamail.setFirstGmail(LOGIN);
        searchGamail.setClickBotton();
        WebDriverContext.captureScreen();

        searchGamail.setPassword(PASSWORD);
        searchGamail.setClickBottonYet();


        WebDriverContext.captureScreen();
        searchGamail.setSearch("Hello User ");
        WebDriverContext.captureScreen();

        //--
        Assert.assertEquals(searchGamail.getText(),"");

    }


    @AfterMethod
    public void tearDown() {
         //WebDriverContext.stop();
    }


}
