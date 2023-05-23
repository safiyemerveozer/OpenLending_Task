package com.openLending.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private Driver(){}
    private static InheritableThreadLocal <WebDriver> driverPool=new InheritableThreadLocal<>();

    public static WebDriver getDriver(){
        if(driverPool.get()==null){
            String browser= System.getProperty("browser") !=null ? browser=System.getProperty("browser"):ConfigReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
            }

        }
        return driverPool.get();
    }

    public static void closeDriver(){
        driverPool.get().quit();
        driverPool.remove();
    }
}
