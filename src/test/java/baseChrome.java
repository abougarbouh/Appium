import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class baseChrome {
   // public static AndroidDriver<AndroidElement> driver;

    public static  AndroidDriver Capabilities() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver;

        String appiumServerurl ="http://127.0.0.1:4723/wd/hub";
      //  File f =new File("src");
       // File fs = new File(f,"ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30_x86");

        // to run chrome in mobile
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");


           // cap.setCapability(MobileCapabilityType.DEVICE_NAME, "S21_Ultra");

    //    cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
         driver=new AndroidDriver<>(new URL(appiumServerurl),cap);
         return  driver;


    }
}
