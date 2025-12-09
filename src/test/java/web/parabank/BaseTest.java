package web.parabank;

import org.testng.annotations.*;
import web.parabank.framework.core.DriverManager;
import web.parabank.framework.core.Session;

public class BaseTest {
    DriverManager dm=new DriverManager();
    Session session=new Session();
    public BaseTest(){}

    @BeforeMethod
    protected void openBrowser(){
        dm.getDriver(session.getBrowser(), session.getBaseurl());
    }

    @AfterMethod
    protected void closeBrowser(){
        dm.quitDriver();
    }
}
