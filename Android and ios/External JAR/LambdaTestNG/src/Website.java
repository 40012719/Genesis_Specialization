import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Website {
	static AppiumDriver<MobileElement> driver;
	@Test
	public static void draw() {
	// TODO Auto-generated method stub
	//Set the Desired Capabilities
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("deviceName", "device");
	 caps.setCapability("udid", "emulator-5554"); //Give Device ID of your mobile phone
	 caps.setCapability("platformName", "Android");
	 caps.setCapability("platformVersion", "10");	
	 caps.setCapability("appPackage","com.google.android.youtube");
	 caps.setCapability("appActivity","com.google.android.apps.youtube.app.WatchWhileActivity");
	 caps.setCapability("noReset", "true");
	try {
	driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	}
	catch (MalformedURLException e) {
	System.out.println(e.getMessage());
	}
}
	}
