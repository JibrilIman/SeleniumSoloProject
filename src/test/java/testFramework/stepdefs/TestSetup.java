package testFramework.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import testFramework.pages.Website;

import java.io.File;
import java.io.IOException;

public class TestSetup {

    private static final String DRIVER_LOCATION = "C:/Users/Jibri/chromedriver.exe";
    private static ChromeDriverService service;
    private static WebDriver webDriver;
    private static int itemCountBeforeRemoval;  // Only define this once

    public static void startChromeService() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(DRIVER_LOCATION))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    public static void createWebDriver(){
        webDriver = new RemoteWebDriver(service.getUrl(), getChromeOptions());
    }

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    static void stopService() {
        service.stop();
    }

    public static void quitWebDriver() {
        webDriver.quit();
    }

    static Website getWebsite(String url){
        webDriver.get(url);
        return new Website(webDriver);
    }
    public static WebDriver getDriver(){
        return webDriver;
    }

}
