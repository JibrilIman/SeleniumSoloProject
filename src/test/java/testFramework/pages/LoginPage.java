package testFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver webDriver;
    private By loginLink = new By.ByClassName("mdc-button_label");

    public LoginPage(WebDriver webDriver) {this.webDriver = webDriver;}

    public void clickLoginLink(){
        webDriver.findElement(loginLink).click();
    }
}
