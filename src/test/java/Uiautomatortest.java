import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Uiautomatortest extends base{
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver <AndroidElement> driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //findElementByAndroidUIAutomator is a spicail way to find elements, work with appium only
        // driver.findElementByAndroidUIAutomator("attribute(\"value\")") we can have double qout in qubel quote
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

      //driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)").size();
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

    }

    }

