import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class swipedemo extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElement(By.xpath("//*[@content-desc='9']")).click();
        TouchAction t=new TouchAction(driver);

        //logn press // on element // for 2 sec
        //move to another element and realase
        WebElement first= driver.findElement(By.xpath("//*[@content-desc='15']"));
        WebElement second= driver.findElement(By.xpath("//*[@content-desc='45']"));

        t.longPress(LongPressOptions.longPressOptions().withElement(element(first)).withDuration(Duration.ofSeconds(2))).moveTo(element(second)).release().perform();

    }
}
