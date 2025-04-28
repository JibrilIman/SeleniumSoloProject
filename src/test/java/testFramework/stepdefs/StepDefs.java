package testFramework.stepdefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    WebDriver driver;

    @Given("I open the homepage")
    public void i_open_the_homepage() {
        driver = new ChromeDriver(); // opens Chrome
        driver.get("https://bookcart.azurewebsites.net"); // or whatever website you want
        driver.quit(); // closes the browser
    }
}
