package ecommerceApp;

import ecommerceApp.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ecommerce_tc_3 extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");
        driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));");
        driver.findElement(By.xpath("//*[@text='Aruba']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));");
        // this might not work
       /*driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView("
                        + "new UiSelector().text(\"Jordan 6 Rings\"));");*/
       int count= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

       for(int i=0; i<count;i++)
       {
         String text=  driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
         if (text.equalsIgnoreCase("Jordan 6 Rings"))
         {
             driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
             break;
         }

       }
       driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
       //this will add the product to cart

        String lastpageText= driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
        Assert.assertEquals("Jordan 6 Rings",lastpageText);
        System.out.println("pass");
    }
}
