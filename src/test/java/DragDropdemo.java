import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DragDropdemo extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
        TouchAction t = new TouchAction(driver);
        //longpress(source/move(destination)//realse
        WebElement source = driver.findElementsByClassName("android.view.View").get(0);

        WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source))).moveTo(ElementOption.element(destination)).release().perform();
    }
}
