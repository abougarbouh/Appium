import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class basics extends base {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver <AndroidElement> driver=Capabilities();
      driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("ahmed");

        // we can use .get if we dont have uniqe id
        driver.findElementsByClassName("android.widget.Button").get(1).click();


    }
}
