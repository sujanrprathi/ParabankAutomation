package web.parabank.framework.core;

public class Session
{
    private static String browser, baseurl;
    public Session(){

        browser=System.getProperty("browser","chrome");
        baseurl=System.getProperty("url");
    }
    public String getBrowser(){
        return browser.toLowerCase();
    }
    public String getBaseurl(){
        return baseurl;
    }

}
