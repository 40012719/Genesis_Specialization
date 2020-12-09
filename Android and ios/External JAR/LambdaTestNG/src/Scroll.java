import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Scroll {
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
		
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(565, 2625)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(558, 434)).release().perform();


}
}