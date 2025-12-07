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
    private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
    public void webDriverManager(String url, String browser){
        WebDriver webDriver = null;
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                webDriver=new ChromeDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                webDriver=new EdgeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                webDriver=new FirefoxDriver();
        }
    dh.implicitWait(webDriver,10);
    }
}
