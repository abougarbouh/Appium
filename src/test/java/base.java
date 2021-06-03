import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class base  {
   // public static AndroidDriver<AndroidElement> driver;

    public static  AndroidDriver Capabilities() throws MalformedURLException {
        String appiumServerurl ="http://127.0.0.1:4723/wd/hub";
        File f =new File("src");
       // File fs = new File(f,"ApiDemos-debug.apk");
        File fs = new File(f,"General-Store.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "S21_Ultra");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");


           // cap.setCapability(MobileCapabilityType.DEVICE_NAME, "S21_Ultra");

        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        AndroidDriver driver=new AndroidDriver(new URL(appiumServerurl),cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         return driver;


    }
}
