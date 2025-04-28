package testFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver webDriver;

    private By homeLink = By.className("mdc-button_label");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickHomeLink() {
        webDriver.findElement(this.homeLink).click();
    }

}
