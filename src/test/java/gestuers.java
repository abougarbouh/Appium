import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
//import static io.appium.java_client.touch.TapOptions.tapOptions;

import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestuers extends base{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        TouchAction t =new TouchAction(driver);
         WebElement list =driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");

        //t.tap(TapOptions.tapOptions().withElement((ElementOption) list)).perform();
        t.tap(TapOptions.tapOptions().withElement(element(list))).perform();

        driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
        WebElement pn =driver.findElementByAndroidUIAutomator("text(\"People Names\")");

        t.longPress(LongPressOptions.longPressOptions().withElement(element(pn)).withDuration(Duration.ofSeconds(2))).release().perform();
        //Thread.sleep(2000);
        System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").isDisplayed());


    }
}
