import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Scrool2 {
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Set the Desired Capabilities




	 DesiredCapabilities caps = new DesiredCapabilities();




	 caps.setCapability("deviceName", "device");




	 caps.setCapability("udid", "emulator-5554"); //Give Device ID of your mobile phone




	 caps.setCapability("platformName", "Android");




	 caps.setCapability("platformVersion", "10");




	 caps.setCapability("app","C:\\Users\\CTEAMYSLP0026\\Downloads\\com.afwsamples.testdpc_7.0.2-7002_minAPI21(nodpi)_apkmirror.com (2).apk");
	//caps.setCapability("appActivity","org.chromium.chrome.browser.ChromeTabbedActivity");

	caps.setCapability("noReset", "true");

	try {
	driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	}
	catch (MalformedURLException e) {
	System.out.println(e.getMessage());
	}

	 org.openqa.selenium.Dimension dimensions = driver.manage().window().getSize();

     Double screenHeightStart = dimensions.getHeight() * 0.9;

     int scrollStart = screenHeightStart.intValue();

     Double screenHeightEnd = dimensions.getHeight() * 0.2;

     int scrollEnd = screenHeightEnd.intValue();

     // int scrollEnd = scrollStart - 10;

     new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))

                   .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))

                  .release().perform();

	}
}

