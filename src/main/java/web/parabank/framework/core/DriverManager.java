package web.parabank.framework.core;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import web.parabank.framework.utils.DriverHelper;

import java.util.Objects;

public class DriverManager {

     DriverHelper dh=new DriverHelper();
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver(String browser, String url) {
        if(driver.get()==null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver.set(new EdgeDriver());
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;

                default:
                    throw new IllegalArgumentException("Unsupported Browser " + browser);
            }
            driver.get().get(url);
            dh.implicitWait(driver.get(),10);
            dh.maxWindow(driver.get());
        }
        return driver.get();
    }public void quitDriver(){
        if(driver.get()!=null) {
            driver.get().quit();
            driver.remove();
        }
    }

}
