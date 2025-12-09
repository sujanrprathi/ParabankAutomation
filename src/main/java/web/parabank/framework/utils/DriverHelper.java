package web.parabank.framework.utils;

import com.google.gson.annotations.Until;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DriverHelper {

    public void implicitWait(WebDriver driver, int timeinseconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinseconds));
    }
    public void maxWindow(WebDriver driver){
        driver.manage().window().maximize();
    }
}
