package testFramework.pages;

import org.openqa.selenium.WebDriver;

public class Website {

    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ShoppingCartPage shoppingCartPage;
    private RegisterPage registerPage;

    public Website(WebDriver webDriver) {
        this.webDriver = webDriver;
        homePage = new HomePage(webDriver);
        loginPage = new LoginPage(webDriver);
        shoppingCartPage = new ShoppingCartPage(webDriver);
        registerPage = new RegisterPage(webDriver);

    }

    public LoginPage getLoginPage(){
        return loginPage;
    }

    public HomePage getHomePage(){
        return homePage;
    }

    public RegisterPage getSignUpPage(){
        return registerPage;
    }

    public ShoppingCartPage getContactUsPage(){
        return shoppingCartPage;
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }

}
