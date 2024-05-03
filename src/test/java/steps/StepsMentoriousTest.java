package steps;
import static org.junit.Assert.assertTrue;
import javax.print.attribute.standard.PagesPerMinute;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@SuppressWarnings({ "unused" })
public class StepsMentoriousTest {

    WebDriver driver = new ChromeDriver() ;

    @Given("Enter the Website for student")
    public void entertheWebsiteStudent() throws Throwable {
        driver.get("https://web.mentorius.app/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Boolean b = driver.findElements(By.xpath("/html/body/flutter-view")).size() > 3;
        Assert.assertEquals(true,driver.findElements(By.xpath("/html/body/flutter-view")));
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        System.out.println("print1");
    }

    @Given("Enter the Website for admin")
    public void entertheWebsiteadmin() throws Throwable {
        driver.get("https://admin.mentorius.app/");
        System.out.println("print2");

    }

    @Given("I log in as a mentor")
    public void loginAsmentor() throws Throwable {

        System.out.println("print1");


    }

    @Given("I log in as a student")
    public void loginAsstudent() throws Throwable {
        System.out.println("print1");

    }


    @Then("I go to the home screen for student")
    public void gotothehomescreenstudent() throws Throwable {
        System.out.println("print2");

    }

    @Then("I go to the home screen for mentor")
    public void gotothehomescreenmentor() throws Throwable {
        System.out.println("print2");

    }


}
