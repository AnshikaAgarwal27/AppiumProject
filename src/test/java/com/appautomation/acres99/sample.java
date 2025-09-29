package com.appautomation.acres99;


import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import java.net.URL;
import java.net.URI;
public class sample {

    static AppiumDriver driver;

    public static void main(String[] args) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("deviceName", "OnePlus 6T");
    capabilities.setCapability("udid", "2f399842");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("platformVersion", "11");
    capabilities.setCapability("automationName", "UiAutomator2");

    capabilities.setCapability("autoGrantPermissions", true);

    capabilities.setCapability("appPackage", "com.nnacres.app");
    capabilities.setCapability("appActivity", ".activity.SplashActivity");


    try {
        Thread.sleep(10000);
        URL serverUrl = new URI("http://127.0.0.1:4723/").toURL();
        driver = new AppiumDriver(serverUrl, capabilities);
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("Application started...");
}

}
