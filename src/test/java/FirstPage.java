
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstPage {

    AndroidDriver driver;

    @BeforeClass
    public void initializeDriver() throws MalformedURLException {
        System.out.println("We are in BeforeClass");
       DesiredCapabilities capabilities = new DesiredCapabilities();


        //capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability("deviceName", "sjhflksadjk");
        //capabilities.setCapability("platformVersion", "7.0");
        //capabilities.setCapability("platformName", "Android");
        //capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appActivity", "com.android.calculator.Calculator");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("newCommandTimeout", 90000);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


        driver.launchApp();
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("We are in after class");
    }


    @Test
    public void enterValue() throws InterruptedException {
        System.out.println("WE are in enterValue method");
        WebElement element = driver.findElement(By.xpath("//android.widget.Button[@cont-desc='18']"));
        Thread.sleep(5000);
        System.out.println("We have entered value as 7");
    }

}

