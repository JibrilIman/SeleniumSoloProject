package testFramework.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testFramework.pages.Website;

import java.io.IOException;

import static org.hamcrest.Matchers.containsString;

public class StepDefs {

    WebDriver driver;
    private Website website;
    private static final String BASE_URL = "https://bookcart.azurewebsites.net/";
    private static final String LOGIN_URL = "https://bookcart.azurewebsites.net/login";
    private static final String REGISTER_URL = "https://bookcart.azurewebsites.net/login";

    @Before
    public static void setup() throws IOException {
        TestSetup.startChromeService();
        TestSetup.createWebDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

        // Always quit the WebDriver and stop the service
        TestSetup.quitWebDriver();
        TestSetup.stopService();

    }

    @Given("I open the homepage")
    public void i_open_the_homepage() {
        website = TestSetup.getWebsite(BASE_URL);
    }

    @And("I open the loginpage")
    public void i_open_the_loginpage() {
        website.getHomePage().clickLoginLink();
    }
}
