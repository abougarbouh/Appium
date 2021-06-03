import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class scrollingSemo extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //Appium dosnt support scrolling, it got depratated
        // to do so we have to use android Api

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");
    }
}
