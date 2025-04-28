package testFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver webDriver;

    private By HomeLink = By.xpath("//button//span[contains(text(),'Book Cart')]");
    private By LoginLink = By.xpath("//span[contains(text(),'Login')]");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickHomeLink(){
        webDriver.findElement(this.HomeLink).click();
    }

    public void clickLoginLink() {
        webDriver.findElement(this.LoginLink).click();
    }

}
