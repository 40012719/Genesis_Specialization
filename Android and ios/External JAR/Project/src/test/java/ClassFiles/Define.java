package ClassFiles;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Define{
	 static AppiumDriver<MobileElement> driver;
	    DesiredCapabilities caps = new DesiredCapabilities();
	        
	        @Given("^launch chrome browser$")
	        public void launch_chrome_browser() throws Throwable {
	            
	             caps.setCapability("deviceName", "device");

	             caps.setCapability("udid", "emulator-5554"); //Give Device ID of your mobile phone
             caps.setCapability("platformName", "Android");

	             caps.setCapability("platformVersion", "11");
	 
	            
	        }

	 

	        @When("^Enter URL$")
	        public void Enter_URL() throws Throwable {
	            caps.setCapability("app","C:\\Users\\CTEAMYSLP0026\\Downloads\\com.afwsamples.testdpc_7.0.2-7002_minAPI21(nodpi)_apkmirror.com (3).apk");
	             
	             //caps.setCapability("appActivity","org.chromium.chrome.browser.ChromeTabbedActivity");
	             
	             
	             caps.setCapability("noReset", "true");   
	             

	             try {
	                 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps); 
	                } 
	                catch (MalformedURLException e) {
	                System.out.println(e.getMessage());
	                }
	            
	            
	        }

	        @Then("^should see home screen$")
	        public void should_see_home_screen() throws Throwable {
	            TouchAction action = new TouchAction(driver);
             org.openqa.selenium.Dimension dimensions = driver.manage().window().getSize();
           Double screenHeightStart = dimensions.getHeight() * 0.9;

	 
	             int scrollStart = screenHeightStart.intValue();

	             Double screenHeightEnd = dimensions.getHeight() * 0.2;
          int scrollEnd = screenHeightEnd.intValue();


	             new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))

	 

	                           .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))

	 

	                          .release().perform();
	             
	          
	        }
}

