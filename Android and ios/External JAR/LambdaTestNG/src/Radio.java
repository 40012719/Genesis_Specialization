import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Radio {
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Set the Desired Capabilities




	 DesiredCapabilities caps = new DesiredCapabilities();




	 caps.setCapability("deviceName", "device");




	 caps.setCapability("udid", "emulator-5554"); //Give Device ID of your mobile phone




	 caps.setCapability("platformName", "Android");




	 caps.setCapability("platformVersion", "10");




	 caps.setCapability("app","C:\\Users\\CTEAMYSLP0026\\Downloads\\RADIO BUTTON_v1.0_apkpure.com.apk");
	//caps.setCapability("appActivity","org.chromium.chrome.browser.ChromeTabbedActivity");

	caps.setCapability("noReset", "true");

	try {
	driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	}
	catch (MalformedURLException e) {
	System.out.println(e.getMessage());
	}
   driver.findElement(By.id("com.somewow.radiobutton:id/radio_two")).click();
   driver.findElement(By.id("com.somewow.radiobutton:id/button_apply")).click();
   


	}

}
