import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class browser  {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        String appiumServerurl ="http://127.0.0.1:4723/wd/hub";
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30_x86");
        cap.setCapability("platformName","Android");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        cap.setCapability(CapabilityType.VERSION,"10");


        driver=new RemoteWebDriver(new URL(appiumServerurl),cap);

       /* driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"m_login_email\"]")).sendKeys("ahmed");
        driver.findElement(By.xpath("//*[@id=\"m_login_password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@value='Log In']")).click();*/

        driver.get("https://m.cricbuzz.com/");
        driver.findElement(By.xpath("//a[@href='#menu']")).click();
        driver.findElement(By.cssSelector("a[title='Cricbuzz Home']")).click();
        System.out.println(driver.getCurrentUrl());
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.xpath("//h4[(text()='Top Stories')]")).getAttribute("class").contains("header")
);
    }
}
