package ecommerceApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ecommerce_tc_2_negitve extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");
        //driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));");
        driver.findElement(By.xpath("//*[@text='Aruba']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        String Toast =driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
        System.out.println(Toast);
        Assert.assertEquals("Please enter your name",Toast);
        //name attribute for tosat messages will have content

    }
}
