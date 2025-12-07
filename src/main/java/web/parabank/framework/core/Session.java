package web.parabank.framework.core;

public class Session
{
    private static String browser, baseurl;
    public void Session(){

        browser=System.getProperty("browser","chrome");
        baseurl=System.getProperty("url");
    }
    public static String getBrowser(){
        return browser.toLowerCase();
    }
    public static String getBaseurl(){
        return baseurl;
    }

}
